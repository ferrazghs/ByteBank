package br.com.alura.bytebank.model

abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {
    abstract fun bonus(): Double
}