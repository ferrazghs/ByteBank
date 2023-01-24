fun conditionalStructure(accountBalance: Double) {
    when {
        accountBalance > 0.0 -> println("Conta Positiva")
        accountBalance == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")
    }
}
