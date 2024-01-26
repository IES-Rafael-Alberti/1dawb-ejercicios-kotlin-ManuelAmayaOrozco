fun ejercicio2_iter_2() {
    print("Dime tu edad: ")
    val edad = readln().toInt()
    print(cuentaEdad(edad))
}

fun cuentaEdad(ed: Int): Int {
    var i = 1
    while (i < ed) {
        println(i)
        i += 1
    }
    return ed
}

fun ejercicio2_iter_4() {
    print("Dime un número entero positivo: ")
    val numer = readln().toInt()
    print(cuentaAtras(numer))
}

fun cuentaAtras(num: Int): String {
    var i = num
    var ser = "$i, "
    while (i > 1){
        i -= 1
        ser = ser + "$i, "
    }
    val fin = i - 1
    ser = ser + "$fin"
    return ser
}

fun ejercicio2_iter_6() {
    print("Dime un número entero: ")
    val number = readln().toInt()
    print(asterTriangulo(number))
}

fun asterTriangulo(num: Int): String {
    for (i in 1..num) {
        for (j in 1..i){
            print("*")
        }
        print("\n")
    }
    return("\n")
}

fun ejercicio2_iter_7() {
    print("Dime un número entero: ")
    val num = readln().toInt()
    print(tablasMultiplicar(num))
}

fun tablasMultiplicar(number: Int): String {
    for (i in 1..10) {
        var res = number * i
        println("$number x $i = $res")
    }
    return("\n")
}

fun ejercicio2_iter_8() {
    print("Dime un número entero: ")
    val numer = readln().toInt()
    print(piramNum(numer))
}

fun piramNum(num: Int): String {
    var numer = num
    var cont = 1
    while (numer > 1){
        cont += 2
        numer -= 1
    }
    for (i in 1..cont step 2) {
        println("")
        for (j in i downTo 1 step 2) {
            print("$j ")
        }
    }
    return("\n")
}

fun ejercicio2_iter_13() {
    print("Dime una palabra o frase: ")
    val phras = readln()
    print(echoPhrase(phras))
}

fun echoPhrase(phrase: String): String {
    var phras = phrase
    var sent = phrase
    while (phras != "salir") {
        phras = recibPhrase()
        sent += "\n$phras"
        println(sent)
    }
    return("\n")
}

fun recibPhrase(): String {
    print("Dime una palabra o frase (Usa 'salir' para terminar): ")
    val recib = readln()
    return recib
}

fun ejercicio2_iter_15() {
    print("Dime un número entero positivo (Introduce 0 para terminar): ")
    val number = readln().toInt()
    print(sumatorNumPos(number))
}

fun sumatorNumPos(num: Int) : String {
    var numer = num
    var sum = 0
    while (numer != 0) {
        if (numer > 0) {
            sum += numer
        }
        numer = recibNum()
    }
    return ("La suma final es $sum")
}

fun recibNum() : Int {
    print("\nDime un número entero positivo: ")
    val number = readln().toInt()
    return number
}

fun ejercicio2_iter_18() {
    print("Dime un número entero positivo (Introduce -1 para terminar): ")
    val number = readln().toInt()
    print(repsumDigs(number))
}

fun repsumDigs (num: Int) : String {
    var numer = num
    var par = 0
    while (numer != -1) {
        print(sumDigs(numer))
        if ((numer % 2) == 0) {
            par += 1
        }
        numer = recibNum()
    }
    return ("El total de números pares es de $par")
}

fun sumDigs(num: Int): String {
    var numer = num
    var sum = 0
    while (numer != 0) {
        val dig = numer % 10
        sum += dig
        numer /= 10
    }
    return ("La suma de los dígitos es $sum")
}

fun ejercicio2_iter_19() {
    print(menuNotes())
}

fun menuNotes() {
    println("MENÚ")
    println("----")
    println("1 - Introduce una nota")
    println("2 - Imprimir listado")
    println("3 - Finaliza programa")
    print("\nSeleccione una opción => ")
    var opt = readln()
    var ser = ""
    while (opt != "esc") {
        when (opt) {
            "1" -> {
                var note = enterNote()
                if (ser == "") {
                    ser = note
                }
                else {
                    ser = "$ser - $note"
                }
            }
            "2" -> println(ser)
            "3" -> {
                println("Programa finalizado.")
                break
            }
            else -> print("**ERROR** Número incorrecto.")
        }
        print("\nSeleccione una opción => ")
        opt = readln()
    }
}

fun enterNote(): String {
    print("Introduzca una nota: ")
    val note = readln()
    return note
}

/**fun ejercicio2_iter_25() {
    print(longestWord())
}**/

/**fun longestWord(): String {
    var phrase = enterPhrase()
    phrase = phrase.strip()
    var wordcount = 0
    var lenglongestword = 0
    while (phrase.lentgh != 0) {
        wordcount += 1
        var conter = phrase.find(" ")
        var cont = 0
        var word = phrase[0:cont]
        if (cont != -1) {
            while (cont < phrase.length and phrase[cont] == " ") {
                cont += 1
            }
            phrase = phrase[cont:]
        }
        else {
            word = phrase
            phrase = ""
        }
        if (word.length > lenglongestword) {
            lenglongestword = word.length
        }
        var longestword = word
    }
    if (wordcount > 0) {
        var word = phrase[0:cont]
        var longestword = word
        print("La palabra más larga es '$longestword'.")
    }
    return ("La cantidad de palabras es de $wordcount.")
}

fun enterPhrase(): String {
    print("Introduce una frase: ")
    val phrase = readln()
    return phrase
}

 No he sabido hacerlo
 **/