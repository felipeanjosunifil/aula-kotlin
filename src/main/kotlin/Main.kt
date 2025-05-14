package org.example

fun main() {
    //region criando variáveis
    println("#### CRIANDO VARIÁVEIS #####")

    var numero = 1
    val numero2: Double = 2.0

    numero = 1000
//    numero2 = 20 val não pode ser alterado

    println("O número é $numero !!")

    println("#### FIM CRIANDO VARIÁVEIS #####\n\n")
    //endregion

    //region funcoes
    println("#### FUNÇÕES #####")
    val num1 = 100
    val num2 = 250

    val resultadoSoma = somaDoisValores(b = num1, a = num2)//parâmetros nomeados

    println("o resultado da soma entre $num1 e $num2 é $resultadoSoma\n\n\n")

    somaDoisValoresEPrinta(num1, num2)

    println("#### FIM FUNÇÕES #####\n\n")
    //endregion

    //region operadores e controle fluxos
    println("#### Inicio operadores ####")
    var diaDaSemana = "Quarta"
    val diaDomes = 28


    //utilizando o controle de fluxo como uma expressão(possui retorno)
    val resultadoOperacao = if(diaDaSemana == "Quarta" && diaDomes == 7) {
        "Talvez hoje tenha Libertadores"
    } else if(diaDaSemana == "Quarta" && diaDomes == 15) {
        "Talvez hoje tenha Libertadores"
    } else {
        "Talve hoje não tenha libestadores"
    }
    println(resultadoOperacao)


    val resultadoDiaDoMes = when(diaDomes) {
        1 -> {
            "Hoje é o primeiro dia do mês"
        }
        //range como verificação do valor
        in 2..27 -> {
            "É apenas um dia normal"
        }
        28 -> {
            "Se for fevereiro pode ser o último dia do mês"
        }
        30 -> {
            "Talvez seja o último dia do mês"
        }
        31 -> {
            "É o último dia do mês"
        }
        else -> {
            "Não é nenhum dia do mês conhecido"
        }
    }

    println(resultadoDiaDoMes)


    println("#### Fim operadores ####\n\n")
    //endregion

    //region laços de repetição

    println("#### INÍCIO LAÇOS DE REPETIÇÃO ####")

    println("Laço de incrementação")
    for(i in 1..10 step 2) {
        println(i)
    }

    println("Lação de decrementação")

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    var controleWhile = 0

    println("Controle de fluxo através de While")
    while(controleWhile < 10) {
//        println(++controleWhile) //incrementa e depois realiza o print
        println(controleWhile++)
    }

    do {
        println(++controleWhile)
    } while (controleWhile < 20)

    println("#### FIM LAÇOS DE REPETIÇÃO ####\n\n")

    //endregion

    //region orientação a objetos

    //endregion
}

//region funções

fun somaDoisValores(a: Int, b: Int): Int {
    val resultado: Int = a + b
    return resultado
}

fun somaDoisValoresEPrinta(a: Int, b: Int = 10) {
    val resultado: Int = a + b
    println("Função print")
    println("o resultado da soma entre $a e $b é $resultado")
}

//endregion