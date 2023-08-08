package com.example.task_retrofit.data.remote.model

data class Item(
    val author: com.example.task_retrofit.data.remote.model.Author,
    val awayTeam: com.example.task_retrofit.data.remote.model.AwayTeam,
    val broadcaster: String,
    val categories: List<Any>,
    val contentType: String,
    val currentState: String,
    val gist: com.example.task_retrofit.data.remote.model.GistX,
    val highlights: List<com.example.task_retrofit.data.remote.model.Highlight>,
    val homeTeam: com.example.task_retrofit.data.remote.model.HomeTeam,
    val id: String,
    val league: com.example.task_retrofit.data.remote.model.League,
    val livestreams: List<com.example.task_retrofit.data.remote.model.Livestream>,
    val metadata: List<com.example.task_retrofit.data.remote.model.Metadata>,
    val preview: com.example.task_retrofit.data.remote.model.Preview,
    val publishDate: Int,
    val related: List<com.example.task_retrofit.data.remote.model.Related>,
    val schedules: List<com.example.task_retrofit.data.remote.model.Schedule>,
    val score: com.example.task_retrofit.data.remote.model.Score,
    val sportsRadar: com.example.task_retrofit.data.remote.model.SportsRadar,
    val states: com.example.task_retrofit.data.remote.model.States,
    val tags: List<com.example.task_retrofit.data.remote.model.Tag>,
    val ticketMasterId: String,
    val ticketUrl: String,
    val title: String,
    val type: Any
)