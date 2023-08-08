package com.example.task_retrofit.domain.use_case

import com.example.task_retrofit.common.Resource
import com.example.task_retrofit.data.remote.model.DataModel
import com.example.task_retrofit.domain.repository.MainRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetDataUseCase @Inject constructor(
    private val repository: MainRepository
) {
    operator fun invoke(): Flow<Resource<DataModel?>> = flow {
        try {
            emit(Resource.Loading<DataModel?>())
            val data = repository.getData()
            emit(Resource.Success<DataModel?>(data))
        }
        /* catch (e: Exception){
             ErrorHandling.errorList.find(e)
             emit(Resource.Error<DataModel?>())
         }*/
        catch (e: HttpException) {
            emit(Resource.Error<DataModel?>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<DataModel?>("Couldn't reach server. Check your internet connection."))
        }
    }
}