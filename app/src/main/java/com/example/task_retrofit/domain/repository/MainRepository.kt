package com.example.task_retrofit.domain.repository

import com.example.task_retrofit.data.remote.model.DataModel

interface MainRepository {
    suspend fun getData(): DataModel?
}