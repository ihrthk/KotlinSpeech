package com.example.kotlinspeak.sample

//Normal
fun showPrice() {
    try {
        val price = 200 / 0
        println(price)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

//Better
fun showPrice2() {
    val price = runCatching { 100 / 0 }.getOrDefault(0)
    println(price)
}


