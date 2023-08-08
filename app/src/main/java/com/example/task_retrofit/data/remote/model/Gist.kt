package com.example.task_retrofit.data.remote.model

data class Gist(
    val categories: Any,
    val contentType: String,
    val description: Any,
    val featuredTag: com.example.task_retrofit.data.remote.model.FeaturedTag,
    val id: String,
    val imageGist: com.example.task_retrofit.data.remote.model.ImageGist,
    val languageCode: String,
    val permalink: String,
    val primaryCategory: com.example.task_retrofit.data.remote.model.PrimaryCategory,
    val scheduleEndDate: Any,
    val scheduleStartDate: Any,
    val site: String,
    val timezone: Any,
    val title: String
)