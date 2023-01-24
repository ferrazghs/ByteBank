package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.AuthenticationFailledException
import br.com.alura.bytebank.exception.InsufficientFundsException

class AccountSalary(
    owner: Client,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {
    override fun withdraw(value: Double, password: Int) {
        val valueWithdraw = value + 0.1

        if (accountBalance < valueWithdraw) {
            throw InsufficientFundsException()
        } else if (!authentication(password)) {
            throw AuthenticationFailledException()
        }
        accountBalance -= valueWithdraw
    }
}