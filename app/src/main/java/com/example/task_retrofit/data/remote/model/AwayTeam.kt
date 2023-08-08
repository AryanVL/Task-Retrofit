package com.example.task_retrofit.data.remote.model

data class AwayTeam(
    val _id: String,
    val currentSeason: String,
    val gist: com.example.task_retrofit.data.remote.model.Gist,
    val id: String,
    val owner: Boolean,
    val records: com.example.task_retrofit.data.remote.model.Records,
    val shortName: String,
    val title: String
)