fun ejercicio1_12() {
    print("Dime tu peso en kilogramos: ")
    val peso = readln().toFloat()
    print("Dime tu altura en metros: ")
    val alto = readln().toFloat()
    val masac = peso / (alto * alto)
    print("Tu indice de masa corporal es ${"%.2f".format(masac)}")
}