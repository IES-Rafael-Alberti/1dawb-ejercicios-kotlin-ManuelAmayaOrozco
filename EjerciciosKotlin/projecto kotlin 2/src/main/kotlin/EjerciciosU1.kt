import java.text.DecimalFormat

fun ejercicio1_4() {
    print("Dime la temperatura en grados Celsius: ")
    val tempc = readln().toFloat()
    val tempf = (tempc * 9 / 5) + 32
    println("La temperatura en Fahrenheit es $tempf")
}

fun ejercicio1_6() {
    print("Dime el precio final del artículo: ")
    val total = readln().toFloat()
    val prec = total / 1.1
    val ivapag = total - prec
    print("El IVA pagado es de ${"%.2f".format(ivapag)}€ y el precio sin IVA es ${"%.2f".format(prec)}€")
}

fun ejercicio1_12() {
    print("Dime tu peso en kilogramos: ")
    val peso = readln().toFloat()
    print("Dime tu altura en metros: ")
    val alto = readln().toFloat()
    val masac = peso / (alto * alto)
    print("Tu indice de masa corporal es ${"%.2f".format(masac)}")
}

fun ejercicio1_15() {
    print("Dime la cantidad de dinero en tu cuenta de ahorros: ")
    var cuenta = readln().toFloat()
    val capital = 0.04
    var inter = 0
    inter = (capital * (1 + inter)).toInt()
    cuenta -= inter
    println("Primer año: ${"%.2f".format(cuenta)}€")
    inter = (capital * (1 + inter)).toInt()
    cuenta -= inter
    println("Segundo año: ${"%.2f".format(cuenta)}€")
    inter = (capital * (1 + inter)).toInt()
    cuenta -= inter
    println("Tercer año: ${"%.2f".format(cuenta)}€")
}

fun ejercicio1_18() {
    print("Dime tu nombre completo: ")
    val nom = readln()
    println(nom.lowercase())
    println(nom.uppercase())
    val capnom = nom.split(' ').joinToString(" ") { it.replaceFirstChar(Char::uppercaseChar) }
    println(capnom)
}

fun ejercicio1_20() {
    print("Dime un número de telefono con el siguiente formato (+34-teléfono-2prefijos): ")
    val tel = readln()
    var newtel = tel.split("-")
    newtel = listOf(newtel[1])
    val newtelstring = newtel.joinToString()
    print("El teléfono sin prefijo y extensión es: $newtelstring")
}

fun ejercicio1_21() {
    print("Dime una frase: ")
    var frase = readln()
    frase = frase.reversed()
    print(frase)
}

fun ejercicio1_22() {
    print("Dime una frase: ")
    val frase = readln()
    print("Dime una vocal en minúscula: ")
    val vocal = readln()
    val mayvocal = vocal.uppercase()
    val frasefinal = frase.split(' ').joinToString(" ") { it.replace(vocal,mayvocal) }
    print(frasefinal)
}

fun ejercicio1_24() {
    print("Dime el precio de un producto, usando dos decimales: ")
    val precio = readln()
    val precsep = precio.split('.')
    print("Son ${precsep[0]} euros y ${precsep[1]} céntimos.")
}

fun ejercicio1_25() {
    print("Dime tu fecha de nacimiento con el siguiente formato (día/mes/año): ")
    val date = readln()
    val datesep = date.split('/')
    println("Día: ${datesep[0]}")
    println("Mes: ${datesep[1]}")
    println("Año: ${datesep[2]}")
}

fun ejercicio1_26() {
    print("Dime los productos de la cesta separados por comas: ")
    val basket = readln()
    print(basket.replace(",","\n"))
}

fun ejercicio1_27() {
    print("Dime el nombre de un producto: ")
    val product = readln()
    print("Dime el precio del producto: ")
    val price = readln().toFloat()
    print("Dime la cantidad de productos que hay: ")
    val quant = readln().toInt()
    val total = quant * price
    val priceformat = DecimalFormat("000000.00")
    val quantformat = DecimalFormat("000")
    val totalformat = DecimalFormat("00000000.00")

    print("$product: ${quantformat.format(quant)} unidades x ${priceformat.format(price)}€ = ${totalformat.format(total)}€")
}