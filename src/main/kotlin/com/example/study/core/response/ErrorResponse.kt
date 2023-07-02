package com.example.study.core.response

const val INVALID_ARGUMENT: String = "Invalid"

data class ErrorResponse (
    val message: String,
    val errorType: String = INVALID_ARGUMENT
)