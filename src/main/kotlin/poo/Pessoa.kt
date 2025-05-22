package org.example.poo

class Pessoa(nome: String, idade: Int, documento: String) {
    var nome: String
        get() = "O nome é $field"
        private set

    var idade: Int
    var documento: String

    init {
        println("Passou pelo bloco init")

        this.nome = nome
        this.idade = idade
        this.documento = documento
    }

    constructor(nome: String, idade: Int): this(nome, idade, "")
}