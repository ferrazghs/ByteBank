package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.Address

fun objectFunTest() {
    var addressTest =  Address(
        address = "Rua Um",
        number = 10,
        zipCode = "22222-22"
    )

    var addressTestTwo =  Address(
        address = "Rua Um",
        number = 10,
        zipCode = "22223-22"
    )

    println(addressTest.hashCode())
    println(addressTestTwo.hashCode())

    println(addressTest.equals(addressTestTwo))
}