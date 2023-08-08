package com.example.task_retrofit.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task_retrofit.common.Resource
import com.example.task_retrofit.domain.use_case.GetDataUseCase
import com.example.task_retrofit.presentation.components.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    getDataUseCase: GetDataUseCase
) : ViewModel() {

    private val _state = mutableStateOf(DataState())
    val state: State<DataState> = _state

    init {

        getDataUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = DataState(data = result.data)
                }

                is Resource.Error -> {
                    _state.value = DataState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = DataState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}
