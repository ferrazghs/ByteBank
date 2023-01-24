package br.com.alura.bytebank.model

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : EmployeeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {
    override fun bonus(): Double = salary * 0.2
}