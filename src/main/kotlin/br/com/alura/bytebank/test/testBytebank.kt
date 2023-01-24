import br.com.alura.bytebank.model.*


fun testBytebank() {
    val accountGabriel = AccountCurrent(
        owner = Client(
            name = "Gabriel",
            cpf = "111.111.111-11",
            password = 1000,
            address = Address("Rua Maria Augusta Pereira do Santos")
        ),
        numberAccount = 1000
    )

    val accountAline = AccountSavings(
        owner = Client(
            name = "Aline",
            cpf = "222.222.222-22",
            password = 1001
        ),
        numberAccount = 1001
    )

    accountGabriel.deposit(100.0)
    accountAline.deposit(200.0)

    println(accountGabriel.owner.name)
    println(accountGabriel.numberAccount)
    println(accountGabriel.accountBalance)
    println(accountGabriel.owner.address.address)

    println()

    println(accountAline.owner.name)
    println(accountAline.numberAccount)
    println(accountAline.accountBalance)

    println()

    println("Depositando na conta do Gabriel")
    accountGabriel.deposit(30.0)
    println("Valor da conta: ${accountGabriel.accountBalance}")

    println("Depositando na conta da Aline")
    accountAline.deposit(30.0)
    println("Valor da conta: ${accountAline.accountBalance}")

    println("Sacando na conta do Gabriel")
    accountGabriel.withdraw(10.0, 1000)
    println("Valor da conta: ${accountGabriel.accountBalance}")

    println("Sacando na conta da Aline")
    accountAline.withdraw(20.0, 1001)
    println("Valor da conta: ${accountAline.accountBalance}")

    println("Transferindo valor da conta do Gabriel para conta da Aline")
    if (accountGabriel.transfer(50.0, accountAline)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Transferência não foi realizada")
    }

    println("Valor da conta Gabriel: ${accountGabriel.accountBalance}")
    println("Valor da conta Aline: ${accountAline.accountBalance}")
}
