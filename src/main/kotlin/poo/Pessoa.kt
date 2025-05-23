package org.example.poo

class Pessoa(nome: String = "", idade: Int = 0, documento: String = "", endereco: Endereco = Endereco()) {
    var nome: String
        private set
        get() = "O nome é $field"//getter customizado
    var idade: Int
        private set
    var documento: String
        private set
    var endereco: Endereco
        private set

    init {
        this.nome = nome
        this.idade = idade
        this.documento = documento
        this.endereco = endereco
    }

    fun setEndereto(ruaEndereco: String) {
        this.endereco.rua = ruaEndereco
    }

    //exemplo próprio mét0do copy
    fun copiar(): Pessoa {
        val p = Pessoa(this.nome, this.idade, this.documento, this.endereco)
        return p
    }

//    constructor (nome: String, idade: Int): this(nome, idade, "", Endereco()) //Existe uma forma mais fácil do que sobrecarregar o construtor
}