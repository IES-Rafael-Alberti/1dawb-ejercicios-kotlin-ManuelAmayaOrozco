fun ejercicio1_4() {
    print("Dime la temperatura en grados Celsius: ")
    val tempc = readln().toFloat()
    val tempf = (tempc * 9 / 5) + 32
    println("La temperatura en Fahrenheit es $tempf")
}