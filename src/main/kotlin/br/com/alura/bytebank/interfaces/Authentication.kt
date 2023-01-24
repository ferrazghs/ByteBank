package br.com.alura.bytebank.interfaces

interface Authentication {

    fun authentication(password: Int): Boolean
}