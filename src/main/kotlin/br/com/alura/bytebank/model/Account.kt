package br.com.alura.bytebank.model

import br.com.alura.bytebank.interfaces.Authentication

abstract class Account(
    val owner: Client,
    val numberAccount: Int

) : Authentication by owner{
    var accountBalance = 0.0
    companion object {
        var countAccount = 0
        private set
    }
    init {
        countAccount++
    }

    fun deposit(value: Double) {
        if (value > 0) {
            accountBalance += value
        }
    }

    abstract fun withdraw(value: Double, password: Int)

    override fun authentication(password: Int): Boolean {
        return owner.authentication(password)
    }
}