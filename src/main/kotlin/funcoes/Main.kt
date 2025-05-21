package org.example.funcoes

fun main(args: Array<String>) {
    val num1 = 500
    var num2 = 150

    val resultado: Int = somaDoisValores(num1, num2)

    println("O resultado da soma $num1 + $num2 é $resultado")

    num2 = 400

    somaEMostraOResultado(b = num1, a = num2)
}

//fun somaDoisValores(a: Int, b: Int): Int {
//    return a + b
//}

//sintaxe resumida
fun somaDoisValores(a: Int, b: Int) = a + b

fun somaEMostraOResultado(a: Int = 10, b: Int = 0) {
    val res = a + b

    if (a == 0 && b == 0) {
        println("Os valores estão zerados")
    } else {
        println("O resultado da soma dentro da função é $res")
    }
}