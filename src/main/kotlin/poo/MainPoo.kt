package org.example.poo

fun main() {
    val p1 = Pessoa("Ciclano", 30, "123.456.789-00")

    println("${p1.nome} ${p1.idade} ${p1.documento}")

    println("\n\n")

    val p2 = Pessoa("Ciclano", 30)

    println("${p2.nome} ${p2.idade} ${p2.documento}")

    println("\n\n")

    val endereco = Endereco("JK", 100, "Londrina", "1234-56")

    println(endereco)

    val endereco2 = Endereco("Belo Horizonte", 750, "Londrina", "1234-58")

    val endereco3 = endereco2.copy(rua =  "Juscelino Kubichesk")

    println(endereco == endereco2)

    println("Endereço 2: $endereco2\n\n")

    println("Endereço 3: $endereco3\n\n")

//    endereco3.rua = "Juscelino Kubichesk"

    println("Endereço 2: $endereco2\n\n")

    println("Endereço 3: $endereco3\n\n")
}