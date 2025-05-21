package org.example.operadoresecontroledefluxo

fun main(args: Array<String>) {
    val maximo = 100

    var num1 = 101

    val resultado: String = if (num1 < maximo) {
        if (num1 == 50) println("")

        //posso colocar o que eu quiser, desde que a última linha retorne o esperado pela expressão


        "Está dentro do permitido"
    } else if(num1 == maximo) {
        "Está no limite"
    } else {
        "Ultrapassou o valor máximo"
    }

    println(resultado)

    val mesDoAno = "Fevereiro"

    var diasDoMes: String = ""

     diasDoMes = when (mesDoAno) {
        "Janeiro" -> {
            "Este mês possui 31 dias"
        }
        "Fevereiro" -> {
            "Este mês possui 28 ou 29 dias"
        }
        "Março" -> {
            "Este mês possui 31 dias"
        }
        "Abril" -> {
            "Este mês possui 30 dias"
        }
        "Maio" -> {
            "Este mês possui 31 dias"
        }
         else -> {
             diasDoMes
         }
    }
}