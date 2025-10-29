package com.example.uthlibrary.data

data class Student(
    val id: Int,
    val name: String,
    val borrowedBooks: MutableList<Book> = mutableListOf()
)
