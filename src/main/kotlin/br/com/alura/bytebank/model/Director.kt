package br.com.alura.bytebank.model

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : EmployeeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {
    override fun bonus(): Double = salary + plr * 0.2
}