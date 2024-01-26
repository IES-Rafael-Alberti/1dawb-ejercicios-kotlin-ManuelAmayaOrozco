fun ejercicio2_exce_2() {
    print("Dime un número entero positivo: ")
    try {
        val numer = readln().toInt()
        print(cuentImpar(numer))
    } catch (e: NumberFormatException) {
        print("**ERROR** Tipo de dato incorrecto.")
    }
}

fun cuentImpar(num: Int): String {
    var i = 1
    var ser = "$i, "
    if ((num % 2) == 0) {
        while (i < (num - 3)) {
            i += 2
            ser += "$i, "
        }
        val fin = num - 1
        ser += "$fin"
        return ser
    }
    else {
        while (i < (num - 2)) {
            i += 2
            ser += "$i, "
        }
        val fin = num - 1
        ser += "$fin"
        return ser
    }
}

fun ejercicio2_exce_3() {
    print("Dime un número entero positivo: ")
    try {
        val numer = readln().toInt()
        print(cuentaAtras(numer))
        if (numer < 0) {
            throw IllegalArgumentException("No se pueden usar números negativos.")
        }
    } catch (e: NumberFormatException) {
        print("**ERROR** Tipo de dato incorrecto.")
    }

}

fun ejercicio2_exce_4() {
    print("Dime un número entero: ")
    try {
        val numer = readln().toInt()
        println("En efecto, $numer es un número entero.")
    } catch (e: NumberFormatException) {
        print("La entrada no es correcta")
    }
}