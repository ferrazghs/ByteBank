package br.com.alura.bytebank.exception

class AuthenticationFailledException(message : String = "Falha na autenticação") : Exception(message) {
}