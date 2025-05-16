package org.example.listas

import java.util.*

fun main() {
    val diasNoMes = mutableMapOf("Janeiro" to 31, "Fevereiro" to 28, "Março" to 31)

    diasNoMes.put("Abril", 30)

    val mesesCom31 = diasNoMes.filter { (mes, qtdDias) -> qtdDias == 31} //filtra map para deixar meses com apenas 31 dias

    println(diasNoMes["Abril"])

    println(mesesCom31)
}