package br.com.alura.bytebank.model

class CalculateBonus {
    var total: Double = 0.0

    fun registerBonus(employee: Employee) {
        this.total += employee.bonus()
    }
}