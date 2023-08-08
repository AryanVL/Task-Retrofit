package com.example.task_retrofit.di

import com.example.task_retrofit.common.Constants
import com.example.task_retrofit.data.remote.Api
import com.example.task_retrofit.data.repository.MainRepositoryImpl
import com.example.task_retrofit.domain.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): Api {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideMainRepository(api: Api): MainRepository {
        return MainRepositoryImpl(api)
    }
}