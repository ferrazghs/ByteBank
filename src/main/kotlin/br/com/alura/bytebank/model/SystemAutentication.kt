package br.com.alura.bytebank.model

import br.com.alura.bytebank.interfaces.Authentication

class SystemAutentication {

    fun login(person: Authentication, password: Int) {
        if (person.authentication(password)) {
            println("Bem Vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }

        when(person) {

            is EmployeeAdmin -> println("Opções admin")
            is Employee -> println("Opções comum")
            else -> println("Opções reduzidas")
        }
    }
}