package com.example.kotlinspeech._05_functional

fun main() {
    val numbers = (1..100).toList()

    val list = mutableListOf<String>()
    for (it in numbers) {
        if (it % 16 == 0) {
            list.add("0x" + it.toString(16))
        }
    }

    println(list)

    repeat(6) {
        println(it)
    }
}

fun repeat(times: Int, body: (Int) -> Unit) {
    for (index in 0 until times) {
        body(index)
    }
}