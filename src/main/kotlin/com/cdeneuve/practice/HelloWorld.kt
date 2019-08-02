package com.cdeneuve.practice

fun main(){
    val name = "Kotlin"
    println("Hello, $name")
}

fun main(args: Array<String>){
    println("Hello, ${args.getOrNull(0)}")
}