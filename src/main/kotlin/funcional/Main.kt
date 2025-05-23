package org.example.funcional

fun main() {

//    somaDoisValoresEPrintaResultado(10, 50)
//    multiplicaDoisValoresEPrintaResultado(10, 50)
//    subtraiDoisValoresEPrintaResultado(100, 50)

    //armazenando funções em variáveis

    val somaDoisValores: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val subtraiDoisValores: (Int, Int) -> Int = { a: Int, b: Int -> a - b }
    val multiplicaDoisValores: (Int, Int) -> Int = { a: Int, b: Int -> a * b }


    val resultado = somaDoisValores(100, 200)

//    println("O resultado da minha função armazenada é $resultado")

    executaOperacaoEPrintaResutado(400, 600, somaDoisValores)

    executaOperacaoEPrintaResutado(1000, 90, subtraiDoisValores)

    executaOperacaoEPrintaResutado(10, 50, multiplicaDoisValores)
}

fun executaOperacaoEPrintaResutado(a: Int, b: Int, operacao:(Int, Int) -> Int) {
    val resultadoOperacao = operacao(a, b)
    println("O resutado da operação é $resultadoOperacao")
}

fun somaDoisValoresEPrintaResultado(a: Int, b: Int) {
    val resultado = a + b
    println("O resutado da operação é $resultado")
}

fun multiplicaDoisValoresEPrintaResultado(a: Int, b: Int) {
    val resultado = a * b
    println("O resutado da operação é $resultado")
}

fun subtraiDoisValoresEPrintaResultado(a: Int, b: Int) {
    val resultado = a - b
    println("O resutado da operação é $resultado")
}