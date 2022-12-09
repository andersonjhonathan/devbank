package br.com.alura.bytebank.modelo

import br.com.devsjava.bytebank.modelo.Autenticavel
import br.com.devsjava.bytebank.modelo.Endereco

class Cliente(
    var nome: String,
    var idade: Int,
    var cpf: Int;
    var cnpj: Int;
    var nome-pai: String
    var nome-mae: String
    var sexo: Boolean           //= (0 = "Masculino" = true || false = "Feminino")
    var email: Email = Email(),
    var doisTelefones: Int
    var endereco: Endereco = Endereco(),
    var
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}