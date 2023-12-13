fun ejercicio1_6() {
    print("Dime el precio final del artículo: ")
    val total = readln().toFloat()
    val prec = total / 1.1
    val ivapag = total - prec
    print("El IVA pagado es de ${"%.2f".format(ivapag)}€ y el precio sin IVA es ${"%.2f".format(prec)}€")
}