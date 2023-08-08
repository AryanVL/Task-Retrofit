package com.example.task_retrofit.presentation.components

import com.example.task_retrofit.data.remote.model.DataModel

data class DataState(
    val isLoading: Boolean = false,
    val data: DataModel? = null,
    val error: String = ""
)
