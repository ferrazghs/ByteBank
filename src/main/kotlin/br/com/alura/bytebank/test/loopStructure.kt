fun loopStructure() {
    var i = 0
    while (i < 5) {
        val owner = "Gabriel $i"
        val numberAccount = 1000 + i
        val accountBalance = i + 10.0

        println("Titular $owner")
        println("Número da Conta $numberAccount")
        println("Saldo da Conta $accountBalance")
        println()
        i++
    }

    for (i in 5 downTo 1 step 2) {
        val owner = "Gabriel $i"
        val numberAccount = 1000 + i
        val accountBalance = i + 10.0

        println("Titular $owner")
        println("Número da Conta $numberAccount")
        println("Saldo da Conta $accountBalance")
        println()
    }
}
