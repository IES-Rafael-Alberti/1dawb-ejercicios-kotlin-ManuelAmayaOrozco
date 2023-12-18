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