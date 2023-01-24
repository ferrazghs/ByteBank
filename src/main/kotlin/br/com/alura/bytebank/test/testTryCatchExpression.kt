package br.com.alura.bytebank.test

import java.lang.NumberFormatException

fun testTryCatchExpression() {
    val numberString: String = "3.0"

    val convertDouble: Double? = try {
        numberString.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val verifyValue: Double? = if (convertDouble != null) {
        convertDouble + 0.1
    } else {
        null
    }

    if (verifyValue != null) {
        println("Taxa adicionada ao valor $verifyValue")
    } else {
        println("Valor nulo")
    }
}
