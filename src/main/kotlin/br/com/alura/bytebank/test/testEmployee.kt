import br.com.alura.bytebank.model.*

fun testEmployee() {
    val employeeJunior = Analyst(
        name = "Junior",
        cpf = "111.111.111.11",
        salary = 3000.0
    )

    println("Name: ${employeeJunior.name}")
    println("CPF: ${employeeJunior.cpf}")
    println("Salary: ${employeeJunior.salary}")
    println("Bonus: ${employeeJunior.bonus()}")

    val managerLuiz = Manager(
        name = "Luiz",
        cpf = "222.222.222.22",
        salary = 5000.0,
        password = 1000
    )

    println("Name: ${managerLuiz.name}")
    println("CPF: ${managerLuiz.cpf}")
    println("Salary: ${managerLuiz.salary}")
    println("Bonus: ${managerLuiz.bonus()}")

    if (managerLuiz.authentication(1000)) {
        println("Autenticação feita com sucesso")
    } else {
        println("Falha na Autenticação")
    }

    val directorGabriel = Director(
        name = "Gabriel",
        cpf = "333.333.333.33",
        salary = 6000.0,
        password = 2000,
        plr = 300.0
    )

    println("Name: ${directorGabriel.name}")
    println("CPF: ${directorGabriel.cpf}")
    println("Salary: ${directorGabriel.salary}")
    println("Bonus: ${directorGabriel.bonus()}")
    println("PLR: ${directorGabriel.plr}")

    if (directorGabriel.authentication(2000)) {
        println("Autenticação feita com sucesso")
    } else {
        println("Falha na Autenticação")
    }

    val analystAna = Analyst(
        name = "Ana",
        cpf = "444.444.444.44",
        salary = 4500.0,
    )

    println("Name: ${analystAna.name}")
    println("CPF: ${analystAna.cpf}")
    println("Salary: ${analystAna.salary}")
    println("Bonus: ${analystAna.bonus()}")

    val assistantJoao = Assistant(
        name = "João",
        cpf = "555.555.555.55",
        salary = 2500.0,
    )

    println("Name: ${assistantJoao.name}")
    println("CPF: ${assistantJoao.cpf}")
    println("Salary: ${assistantJoao.salary}")
    println("Bonus: ${assistantJoao.bonus()}")

    val calculate = CalculateBonus()

    calculate.registerBonus(employeeJunior)
    calculate.registerBonus(managerLuiz)
    calculate.registerBonus(directorGabriel)
    calculate.registerBonus(analystAna)
    calculate.registerBonus(assistantJoao)

    println("Total de bonus: ${calculate.total}")
}
