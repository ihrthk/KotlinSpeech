package com.example.kotlinspeak._03_functions

class StringUtil {

    fun getFirstWorld(s: String, separator: String): String {
        val index = s.indexOf(separator)
        return if (index < 0) s else s.substring(0, index)
    }

    fun getFirstWorld(s: String) = getFirstWorld(s, " ")
}

fun main(args: Array<String>) {
    println(StringUtil().getFirstWorld("Jane Doe"))
}