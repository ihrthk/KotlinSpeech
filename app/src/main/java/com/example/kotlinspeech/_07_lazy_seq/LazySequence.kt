package com.example.kotlinspeech._07_lazy_seq

fun main(args: Array<String>) {
    val seq = sequence {
        var a = 1
        var b = 1

        while (true) {
            yield(a)
            val temp = a
            a = b
            b += temp
        }
    }

    println(seq.take(20).toList())
}