package com.example.task_retrofit.data.remote.model

data class GistX(
    val categories: Any,
    val contentType: String,
    val description: String,
    val featuredTag: com.example.task_retrofit.data.remote.model.FeaturedTag,
    val id: String,
    val languageCode: String,
    val permalink: String,
    val primaryCategory: com.example.task_retrofit.data.remote.model.PrimaryCategoryX,
    val scheduleEndDate: Any,
    val scheduleStartDate: Any,
    val site: String,
    val timezone: Any,
    val title: String
)