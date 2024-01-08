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
    do {
        print("¿Eres hombre o mujer? (Escribe solo 1 para Hombre o 2 para Mujer): ")
        sexo = readln().toInt()
    } while (sexo !in 1..2)
    val res = asiggrupo(nombre, sexo)
}

fun asiggrupo(nombre: String, sexo: Int) {
    val nom = nombre[0]
    var fact1 = true
    var fact2 = true
    when (nom) {
        'A','B','C','D','E','F','G','H','I','J','K','L','M' -> fact1 = true
        'N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z' -> fact1 = false
    }
    when (sexo) {
        1 -> fact2 = true
        2 -> fact2 = false
    }
    if (fact1 == true){
        if (fact2 == true){
            print("Eres parte del Grupo B.")
        }
        else {
            print("Eres parte del Grupo A.")
        }
    }
    else {
        if (fact2 == true){
            print("Eres parte del Grupo A.")
        }
        else {
            print("Eres parte del Grupo B.")
        }
    }
}

fun ejercicio2_cond_8() {
    print("Dime tu puntuación de rendimiento: ")
    val punt = readln().toFloat()
    return rendimiento(punt)
}

fun rendimiento(niv: Float) {
    val din = niv * 2400
    if (niv <= 0.3) {
        print("Nivel inaceptable, recibirá una paga de $din€.")
    }
    else if (0.4 <= niv){
        if (niv <= 0.5){
            print("Nivel aceptable, recibirá una paga de $din€.")
        }
    }
    else {
        print("Nivel meritorio, recibirá una paga de $din€.")
    }
}

fun ejercicio2_cond_10(): String {
    print("¿Quieres que tu pizza sea vegetariana? (V para Vegetariana, N para Normal): ")
    val eleccion = readln()
    if (eleccion == "V") {
        print(elecIngredveg())
    }
    else {
        print(elecIngred())
    }
    return pizzatime(eleccion)
}

fun elecIngredveg() {
    println("Elige un ingrediente (Pimiento, Tofu): ")
    val ingr = readln()
    print("Su pizza vegetariana lleva: Mozzarella, Tomate, $ingr.")
}

fun elecIngred() {
    println("Elige un ingrediente (Peperoni, Jamón, Salmón, Pimiento, Tofu): ")
    val ingr = readln()
    print("Su pizza vegetariana lleva: Mozzarella, Tomate, $ingr.")
}

fun pizzatime(elec: String): String{
    if (elec == "V"){
        return "V"
    }
    else{
        return "N"
    }
}