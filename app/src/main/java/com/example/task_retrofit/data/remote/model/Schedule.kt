package com.example.task_retrofit.data.remote.model

data class Schedule(
    val endDate: Int,
    val startDate: Int,
    val venue: com.example.task_retrofit.data.remote.model.Venue
)