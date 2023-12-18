fun ejercicio2_cond_2() {
    val password = getPassword()
    if (tPassword(password))
        println("Has acertado")
    else
        println("Has fallado")
}

fun getPassword(): String {
    print("Introduce una contraseña: ")
    return readln()
}

fun tPassword(password: String): Boolean {
    val passOrig = "contraseña"
    return password.replace(" ", "") == passOrig
}

fun ejercicio2_cond_3() {
    print("Dime un número: ")
    val num1 = readln().toInt()
    print("Dime otro número: ")
    val num2 = readln().toInt()
    val res = division(num1, num2)
    if (res == -1) {
        print("Error, no se puede dividir por 0.")
    }
    else {
        print(res)
    }
}

fun division(num1: Int, num2: Int) =
    if (num2 == 0) {
        -1
    }
    else {
        val res = num1.toDouble() / num2
        res
    }
