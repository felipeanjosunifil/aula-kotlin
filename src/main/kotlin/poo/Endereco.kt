package org.example.poo

data class Endereco(var rua: String, var numero: Int, var cidade: String, var cep: String = "") {

//    fun eIgualA(endereco: Endereco): Boolean {
//        return this.cep == endereco.cep && this.numero == endereco.numero && this.cidade == endereco.cidade
//    }

    //é possível sobrescrever o métod equals
//    override fun equals(other: Any?): Boolean {
//        return other is Endereco && other.cep == this.cep
//    }
}