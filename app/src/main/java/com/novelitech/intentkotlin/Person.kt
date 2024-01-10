package com.novelitech.intentkotlin

import java.io.Serializable

// I need to inherit from Serializable to pass this data class in Intention as argument
data class Person(
    val name: String,
    val age: Int,
    val country: String
) : Serializable

