package br.com.devsjava.bytebank.modelo

import br.com.alura.bytebank.modelo.email

class Email(
    var email1: String = "" + "@" + "",
    var email2: String = "" + "@" + "",
    ){
    override fun toString(): String {
        return """
Email(email1='$email', 
Email(email2='$email', 
""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Email

        if (email1 != other.email1) return false
        if (email2 != other.email2) return false

        return true
    }
}
