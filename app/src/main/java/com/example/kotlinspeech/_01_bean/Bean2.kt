package com.example.kotlinspeak._01_bean

class Bean2 {
    private var name: String
    private var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

