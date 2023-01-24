package br.com.alura.bytebank.model

import br.com.alura.bytebank.interfaces.Authentication

abstract class EmployeeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    private val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Authentication {
    override fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}