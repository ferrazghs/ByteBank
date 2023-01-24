package br.com.alura.bytebank.interfaces

import br.com.alura.bytebank.model.Account

interface Transfer {

    fun transfer(value: Double, account: Account): Boolean
}