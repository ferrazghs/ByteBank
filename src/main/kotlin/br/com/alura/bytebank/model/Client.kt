package br.com.alura.bytebank.model

import br.com.alura.bytebank.interfaces.Authentication

class Client(
    val name: String,
    val cpf: String,
    private val password: Int,
    var address : Address = Address()
) : Authentication {

    override fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }

}