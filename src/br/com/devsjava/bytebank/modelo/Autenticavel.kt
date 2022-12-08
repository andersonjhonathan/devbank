package br.com.devsjava.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}