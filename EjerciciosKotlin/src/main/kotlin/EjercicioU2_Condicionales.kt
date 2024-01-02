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

fun ejercicio2_cond_6() {
    print("Dime un nombre: ")
    val nombre = readln()
    var sexo = 0
    while (sexo != 1 and sexo != 2) {
        print("¿Eres hombre o mujer? (Escribe solo 1 para Hombre o 2 para Mujer): ")
        sexo = readln().toInt()
    }
    val res = asiggrupo(nombre, sexo)
}

fun assiggrupo(nombre: String, sexo: Int) {
    nom = nom[0]
    if((nom == "A" or nom == "B" or nom == "C" or nom == "D" or nom == "E" or nom == "F" or nom == "G" or nom == "H" or nom == "I" or nom == "J" or nom == "K" or nom == "L" or nom == "M") and sex == 1):
    print("Eres parte del grupo B.")
    else if((nom == "A" or nom == "B" or nom == "C" or nom == "D" or nom == "E" or nom == "F" or nom == "G" or nom == "H" or nom == "I" or nom == "J" or nom == "K" or nom == "L" or nom == "M") and sex == 2):
    print("Eres parte del grupo A.")
    else if((nom == "N" or nom == "O" or nom == "P" or nom == "Q" or nom == "R" or nom == "S" or nom == "T" or nom == "U" or nom == "V" or nom == "W" or nom == "X" or nom == "Y" or nom == "Z") and sex == 1):
    print("Eres parte del grupo A.")
    else if((nom == "N" or nom == "O" or nom == "P" or nom == "Q" or nom == "R" or nom == "S" or nom == "T" or nom == "U" or nom == "V" or nom == "W" or nom == "X" or nom == "Y" or nom == "Z") and sex == 2):
    print("Eres parte del grupo B.")
}