package com.example.kotlinspeech._06_coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    coroutines(100_000)
}

fun threads(n: Int) {
    val threads = List(n) {
        thread {
            Thread.sleep(1_000)
            println(it)
        }
    }
    threads.forEach {
        it.join()
    }
}


fun coroutines(n: Int) = runBlocking {
    val jobs = List(100_000) {
        async {
            delay(1000)
            println("$it  ${Thread.currentThread().name}")
        }
    }

    jobs.forEach {
        it.join()
    }
}