import br.com.alura.bytebank.model.*

fun testAccount() {
    val accountCurrent = AccountCurrent(
        owner = Client(name = "Gabriel", cpf = "111.111.111-11", password = 1000),
        numberAccount = 1000
    )

    val accountSavings = AccountSavings(
        owner = Client(name = "Ligia", cpf = "222.222.222-22", password = 1001),
        numberAccount = 1001
    )

    accountCurrent.deposit(1000.0)
    accountSavings.deposit(1000.0)

    println("Saldo Conta Corrente: ${accountCurrent.accountBalance}")
    println("Saldo Conta Corrente: ${accountSavings.accountBalance}")

    accountCurrent.withdraw(100.0, 1000)
    accountSavings.withdraw(100.0, 1001)

    println("Saque Conta Corrente: ${accountCurrent.accountBalance}")
    println("Saque Conta Corrente: ${accountSavings.accountBalance}")

    accountCurrent.transfer(100.0, accountSavings)
    accountSavings.transfer(100.0, accountCurrent)

    println("Transferencia Conta Corrente para Conta Poupança: ${accountCurrent.accountBalance}")
    println("Transferencia Conta Poupança para Conta Corrente: ${accountSavings.accountBalance}")
}
