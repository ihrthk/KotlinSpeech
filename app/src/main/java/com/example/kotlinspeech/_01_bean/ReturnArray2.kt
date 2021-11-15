package com.example.kotlinspeak._01_bean

//Change your mind about how expensive a class is
data class FullName(val first: String, val last: String)

fun parseName2(name: String): FullName {
    val space = name.indexOf(" ")
    return FullName(
        name.substring(0, space),
        name.substring(space + 1)
    )
}

fun main(args: Array<String>) {
    val name = parseName2("Jane Doe")
    val first = name.first
    val last = name.last

    println("$first $last")
    if (name == parseName2("Jane Doe")) {
        println("Equals is work")
    }
}