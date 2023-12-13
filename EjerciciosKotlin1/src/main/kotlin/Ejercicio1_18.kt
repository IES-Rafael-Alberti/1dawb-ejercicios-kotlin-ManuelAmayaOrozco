fun ejercicio1_18() {
    print("Dime tu nombre completo: ")
    val nom = readln()
    println(nom.lowercase())
    println(nom.uppercase())
    val capnom = nom.split(' ').joinToString(" ") { it.replaceFirstChar(Char::uppercaseChar) }
    println(capnom)
}