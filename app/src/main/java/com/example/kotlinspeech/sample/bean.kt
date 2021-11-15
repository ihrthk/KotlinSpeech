package com.example.kotlinspeak.sample

data class BaseEntity(
    var statusCode: Int = 0,
    var statusDescription: String = "",
    var taskId: String = ""
)