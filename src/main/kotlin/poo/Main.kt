package org.example.poo

fun main() {
    var p1 = Pessoa("Fulano", 30, "123.456.789-00")

    var end1 = Endereco("Rua dos dev", 100, "Londrina")

    var end2 = end1.copy()


    end1.rua = "Rua das palmeiras"

    println(end1)
    println(end2)

    println(p1.nome)

    p1.setEndereto("Novo endereço")
}