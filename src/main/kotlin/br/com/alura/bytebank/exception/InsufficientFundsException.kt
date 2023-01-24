package br.com.alura.bytebank.exception

class InsufficientFundsException(message : String = "Saldo Insuficiente") : Exception(message) {
}