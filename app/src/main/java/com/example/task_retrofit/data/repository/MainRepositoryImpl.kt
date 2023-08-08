package com.example.task_retrofit.data.repository

import com.example.task_retrofit.data.remote.Api
import com.example.task_retrofit.data.remote.model.DataModel
import com.example.task_retrofit.domain.repository.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: Api
) : MainRepository {
    override suspend fun getData(): DataModel? {
        return api.getData(
            site = "msnuat",
            start = "1688223896",
            end = "1690815896",
            offset = 0,
            limit = 100
        ).body()
    }
}