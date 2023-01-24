package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.Client
import br.com.alura.bytebank.model.Director
import br.com.alura.bytebank.model.Manager
import br.com.alura.bytebank.model.SystemAutentication

fun testAuthentication() {
    val managerGabriel = Manager(
        name = "Gabriel",
        cpf = "111.111.111-11",
        salary = 3000.0,
        password = 1000
    )

    val directorLuiz = Director(
        name = "Luiz",
        cpf = "222.222.222-22",
        salary = 3500.0,
        password = 2000,
        plr = 300.0
    )

    val clientGil = Client(
        name = "Gilberto",
        cpf = "333.333.333-33",
        password = 3000,
    )

    val systemAutentication = SystemAutentication()
    systemAutentication.login(managerGabriel, 1000)
    systemAutentication.login(directorLuiz, 2000)
    systemAutentication.login(clientGil, 3000)
}