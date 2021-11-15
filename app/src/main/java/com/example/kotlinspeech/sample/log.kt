package com.example.kotlinspeak.sample

import android.content.res.Resources
import android.util.Log
import kotlin.math.log2

//Normal
class DebugLog {
    companion object {
        fun log(tag: String, msg: String) {
            Log.d(tag, msg)
        }
    }
}

//Better
fun Any.log2(tag: String = this::class.simpleName ?: "App", msg: String) {
    Log.d(tag, msg)
}



