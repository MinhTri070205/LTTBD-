package com.example.uthlibrary.data

data class Book(
    val id: Int,
    val title: String,
    var isBorrowed: Boolean = false
)
