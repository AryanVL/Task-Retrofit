package com.example.task_retrofit.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.task_retrofit.presentation.components.DataState
import com.example.task_retrofit.ui.theme.TaskRetrofitTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskRetrofitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: MainActivityViewModel = viewModel()
                    val state = viewModel.state.value

                    LoadData(state = state)
                }
            }
        }
    }
}

@Composable
fun LoadData(state: DataState, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        if (state.data != null)
            Text(text = state.data.items.toString(), fontStyle = FontStyle.Italic)
    }
    if (state.isLoading) {
        Box(modifier = Modifier.wrapContentSize()) {
            LinearProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
    if (state.error.isNotBlank()) {
        Text(
            text = state.error,
            modifier = modifier
        )
    }
}
