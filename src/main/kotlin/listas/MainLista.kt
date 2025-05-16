package org.example.listas

fun main() {
    var minhaLista: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val novaLista = minhaLista.plus(11)

    val diasDaSemana = mutableListOf("Segunda", "Terçca", "Quarta")

    minhaLista = listOf(10, 11, 12)

    diasDaSemana.add("Quinta")

//    diasDaSemana = mutableListOf() //não consigo alterar um value(val)

    println(minhaLista)
    println(novaLista)

}