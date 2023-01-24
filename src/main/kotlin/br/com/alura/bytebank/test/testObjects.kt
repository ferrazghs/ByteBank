package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.Account.Companion.countAccount
import br.com.alura.bytebank.model.AccountCurrent
import br.com.alura.bytebank.model.Client
import testBytebank

fun testObjects() {
    testBytebank()

    val accountLucas = AccountCurrent(
        Client(
            name = "Lucas",
            cpf = "111.111.111-11",
            password = 1
        ),
        numberAccount = 1000
    )

    println("Quantidade de contas $countAccount")
}
