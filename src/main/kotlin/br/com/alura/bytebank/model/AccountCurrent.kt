package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.AuthenticationFailledException
import br.com.alura.bytebank.exception.InsufficientFundsException
import br.com.alura.bytebank.interfaces.Transfer

class AccountCurrent(
    owner: Client,
    numberAccount: Int,
) : Account(
    owner = owner,
    numberAccount = numberAccount,
), Transfer {
    override fun withdraw(value: Double, password: Int) {
        val valueWithdraw = value + 0.1

        if (accountBalance < valueWithdraw) {
            throw InsufficientFundsException()
        } else if (!authentication(password)) {
            throw AuthenticationFailledException()
        }
        accountBalance -= valueWithdraw
    }

    override fun transfer(value: Double, account: Account): Boolean {
        if (accountBalance >= value) {
            accountBalance -= value
            account.accountBalance += value
            return true
        } else {
            return false
        }
    }
}