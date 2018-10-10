package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    com.tom.Human().hello()
    val h = Human()
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}