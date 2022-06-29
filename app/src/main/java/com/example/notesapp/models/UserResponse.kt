package com.example.notesapp.models

import com.example.notesapp.models.User

data class UserResponse(
    val token: String,
    val user: User
)