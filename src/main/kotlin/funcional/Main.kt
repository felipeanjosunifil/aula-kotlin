package org.example.funcional

fun main() {

    val funSomarDoisValores: (Int, Int) -> Int = { a: Int, b: Int -> a + b}

    val funMultiplcarDoisValores: (Int, Int) -> Int = { a: Int, b: Int -> a * b}

    fazOperacaoEPrintaOResultado(funMultiplcarDoisValores)
}

fun fazOperacaoEPrintaOResultado(operacao: (Int, Int)-> Int) {
    val resultadoOperacao = operacao(100, 500)

    println("O resultado da operação é $resultadoOperacao")
}