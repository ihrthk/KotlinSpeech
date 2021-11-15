package com.example.kotlinspeak._02_properties

//No get/set fun
private var prop: String = "..."
fun getProp() = prop
fun setProp(v: String) {
    println("New value $v")
    prop = v
}

private var _os: String? = null
val os: String
    get() {
        if (_os == null) {
            println("Computing...")
            _os = "Android 12"
        }
        return _os!!
    }

fun main(args: Array<String>) {
    for (i in 1..3) {
        println(os)
    }
}
