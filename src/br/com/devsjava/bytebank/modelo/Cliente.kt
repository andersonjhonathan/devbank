package br.com.alura.bytebank.modelo

import br.com.devsjava.bytebank.modelo.Autenticavel
import br.com.devsjava.bytebank.modelo.Endereco

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}