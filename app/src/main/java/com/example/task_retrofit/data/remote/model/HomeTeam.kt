package com.example.task_retrofit.data.remote.model

data class HomeTeam(
    val _id: String,
    val currentSeason: String,
    val gist: com.example.task_retrofit.data.remote.model.GistXXX,
    val id: String,
    val owner: Boolean,
    val shortName: String,
    val title: String
)