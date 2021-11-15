package com.example.kotlinspeech

import kotlinx.coroutines.*

fun main() {

    @OptIn(DelicateCoroutinesApi::class)
    val globalScopeReporter = GlobalScope.launch {
        while (true) {
            delay(1000)
            logStatistics()
        }
    }

    GlobalScope.launch {
        delay(1_000)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2_000)
}

fun logStatistics() {
    TODO("Not yet implemented")
}

