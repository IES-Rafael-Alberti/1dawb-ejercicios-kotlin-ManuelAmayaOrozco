fun ejercicio3_listu_4() {
    print(numLotLista())
}

fun numLotLista(): String {
    try {
        var numer_list = mutableListOf<Int>()
        var pos = 0
        while (pos != 6){
            var num = recibNumLot(numer_list)
            numer_list.add(num)
            pos += 1
        }
        numer_list = numer_list.sorted().toMutableList()
        var num = recibNumRei(numer_list)
        numer_list.add(num)
        return ("El conjunto de números de loteria final es $numer_list")
    } catch (e: NumberFormatException) {
        return ("**ERROR** Tipo de dato incorrecto.")
    }
}

fun recibNumLot(numer_list: MutableList<Int>): Int {
    print("Dime el número de la loteria a introducir: ")
    val num = readln().toInt()
    if (num < 1) {
        throw IllegalArgumentException("El número ha de ser mayor que 0.")
    }
    else if (num > 49) {
        throw IllegalArgumentException("El número ha de ser menor que 50.")
    }
    else if (num in numer_list) {
        throw IllegalArgumentException("El número ya se encuentra en la lista.")
    }
    else {
        return num
    }
}

fun recibNumRei(numer_list: MutableList<Int>): Int{
    print("Dime el número de reintegro a introducir: ")
    val num = readln().toInt()
    if (num < 0) {
        throw IllegalArgumentException("El número no puede ser menor que 0.")
    }
    else if (num > 9) {
        throw IllegalArgumentException("El número no puede ser mayor que 9.")
    }
    else {
        return num
    }
}

fun ejercicio3_listu_6() {
    val (asiglist, notelist) = asigListMakerScore()
    print(failedAsigPrinter(asiglist, notelist))
}

fun asigListMakerScore(): Pair<MutableList<String>, MutableList<Float>> {
    var asig_list = mutableListOf<String>()
    var note_list = mutableListOf<Float>()
    var asig = ""
    var pos = 0
    print("Escribe una clase para añadir a la lista. (Escribe 0 para dejar de añadir clases): ")
    asig = readln()
    print("Escribe la nota que has sacado en la clase introducida: ")
    var note = readln().toFloat()
    while (asig != "0") {
        asig_list.add(asig)
        note_list.add(note)
        pos += 1
        asig = enterAsig()
        if (asig != "0") {
            note = enterScore()
        }
    }
    return Pair(asig_list, note_list)
}

fun enterAsig(): String {
    print("Escribe una clase para añadir a la lista: ")
    val asig = readln()
    return asig
}

fun enterScore(): Float {
    print("Escribe la nota que has sacado en la clase introducida: ")
    val score = readln().toFloat()
    return score
}

fun failedAsigPrinter(asig_list: MutableList<String>, note_list: MutableList<Float>): String {
    var counter = 0
    var count = 0
    var asigrep_list = mutableListOf<String>()
    var noterep_list = mutableListOf<Float>()

    for (asig in asig_list) {
        var note_temp = note_list[counter]
        if (note_temp < 5){
            asigrep_list.add(asig_list[counter])
            noterep_list.add(note_list[counter])
        }
        counter += 1
    }

    while (count < (asigrep_list.size - 1)) {
        println("Has de repetir ${asigrep_list[count]} ya que has sacado un ${"%.2f".format(noterep_list[count])}.")
        count += 1
    }

    return ("Has de repetir ${asigrep_list[count]} ya que has sacado un ${"%.2f".format(noterep_list[count])}.")
}

fun ejercicio3_listu_8() {
    val word = receiveWord()
    print(palindromeDetector(word))
}

fun receiveWord(): String {
    print("Introduce una palabra: ")
    val word = readln()
    return word
}

fun palindromeDetector(word: String): String {
    var rev_word = word
    var listword = word.toList()
    var listrev_word = rev_word.toList()
    listrev_word = listrev_word.reversed()
    if (listword == listrev_word) {
        return "Es un palíndromo."
    }
    else {
        return "No es un palíndromo."
    }
}

fun ejercicio3_listu_9() {
    val word = receiveWord()
    print(vowelCounter(word))
}

fun vowelCounter(word: String): MutableList<Int> {
    var list_appear = mutableListOf<Int>()
    val vowels = listOf("a", "e", "i", "o", "u")
    for (vowel in vowels) {
        var appear = 0
        for (letter in word) {
            if (letter.toString() == vowel) {
                appear += 1
            }
        }
        println("La vocal ${vowel} aparece ${appear} veces en la palabra.")
        list_appear.add(appear)
    }
    return list_appear
}

fun ejercicio3_listu_10() {
    var price_list = listOf(50, 75, 46, 22, 80, 65, 8)
    price_list = price_list.sorted()
    println("El menor precio de la lista es ${price_list[0]}")
    println("El mayor precio de la lista es ${price_list[price_list.size - 1]}")
}

fun ejercicio3_listu_13() {
    print("¿Cuántos números deseas introducir?: ")
    val amount = readln().toInt()
    var num_list = receiveNum(amount)
    var med = calcMed(num_list)
    var typdev = calcTypDev(num_list, med)
    print("La media es ${"%.2f".format(med)} y la desviación típica es ${"%.2f".format(typdev)}.")
}

fun receiveNum(amount: Int): MutableList<Int> {
    var count = amount
    var num_list = mutableListOf<Int>()
    while (count != 0) {
        print("Dime un número para añadir a la lista: ")
        var num = readln().toInt()
        num_list.add(num)
        count -=1
    }
    return num_list
}

fun calcMed(num_tup: MutableList<Int>): Float {
    var sum = 0
    for (i in num_tup) {
        sum += i
    }
    val med = sum / num_tup.size
    return med.toFloat()
}

fun calcTypDev(num_tup: MutableList<Int>, med: Float): Float {
    var sumsquared = 0
    for (i in num_tup) {
        sumsquared += (i * i)
    }
    val typdev = (sumsquared / num_tup.size - (med * med))*(1/2)
    return typdev.toFloat()
}