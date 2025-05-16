package org.example

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite seu nome")
    val nome: String = scanner.nextLine()

    println("Digite sua idade")
    val idade: Int = scanner.nextInt()

    println("Olá $nome, legal saber que você tem $idade anos")
}