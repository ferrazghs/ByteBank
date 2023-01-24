package br.com.alura.bytebank.model

open class Assistant(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun bonus(): Double = salary * 0.1
}