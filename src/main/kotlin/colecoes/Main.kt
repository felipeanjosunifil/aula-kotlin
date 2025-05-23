package org.example.colecoes

fun main() {
    var list1: List<Int> = listOf(1, 2, 3, 4, 5)

    val list2 = mutableListOf(1, 2, 3, 4, 5) //infere tipo de forma implicita

    list1.plus(6) //cria uma nova lista contendo o novo elemento

    list2.add(6) //adiciona na lista atual

    println(list1)
    println(list2)

//    list2 = mutableListOf() //mesmo sendo mutable lista não é possíve reatribuir

    list1 = listOf(10, 11, 12, 13,14)


    println("Iterando sobre a lista 1")
    for(item in list1) {
        println(item)
    }

    println("Iterando sobre a lista 2")
    list2.forEach { item ->
        println(item)
    }
}