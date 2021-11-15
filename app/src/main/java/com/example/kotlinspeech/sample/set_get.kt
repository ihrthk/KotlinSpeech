package com.example.kotlinspeak.sample

//Normal
object Config {
    var name: String = ""
    fun setName2(name: String) {
        this.name = name
    }

    fun getName2(): String {
        return name
    }
}

//Better
object Config2 {
    var name: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
}