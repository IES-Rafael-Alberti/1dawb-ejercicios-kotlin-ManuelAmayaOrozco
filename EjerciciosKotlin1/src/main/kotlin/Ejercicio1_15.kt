import java.text.DecimalFormat

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