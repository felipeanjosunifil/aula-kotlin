package org.example.loops

fun main(args: Array<String>) {

    for(i in 1..10) {
        println(i)
    }

    println("\n\n")

    //for com passo 2 em 2
    for(i in 1..10 step 2) {
        println(i)
    }

    println("\n\n")

    for (i in 10 downTo 1 step 3) {
        println(i)
    }

    var a = 1

    println("\n\n")

    while(a <= 10) {
        println(a)
        a += 2
    }

    println("\n\n")

    do {
        println(a)
        a += 3
    } while (a <= 20)
}