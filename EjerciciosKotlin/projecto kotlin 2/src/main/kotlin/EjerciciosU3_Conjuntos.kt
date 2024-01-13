/**
 * No he sabido hacerlo
 * fun ejercicio3_conj_1() {
    val lista_compras = listOf<List<Any>>(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218")
    )

    val domicilios = domicilios_clientes(lista_compras)
    println(mostrar_domicilios(domicilios, false))
}

fun domicilios_clientes(lista_compras: List<List<Any>>): MutableSet<Any> {
    val domicilios = mutableSetOf<Any>()
    for (compra in lista_compras) {
        domicilios.add(compra[3])
    }
    return domicilios
}

fun mostrar_domicilios(domicilios: MutableSet<Any>, ordenado: Boolean) {
    if (ordenado) {
        var lista_domicilios = domicilios.toList()
        println(mostrar_lista(lista_domicilios.sorted()))
    }
    else{
        println(mostrar_lista(domicilios))
    }
}

fun mostrar_lista(domicilios: Any) {
    for (domicilio in domicilios) {
        println(domicilio)
    }
}

private fun <E> List<E>.sorted(): Any {

}*/

//El último no se como hacerlo
fun ejercicio3_conj_2() {
    val alumnos_primaria = pedir_alumnos("Introduzca los alumnos de Primaria ('x' para terminar): ")
    val alumnos_secundaria = pedir_alumnos("Introduzca los alumnos de Secundaria ('x' para terminar): ")

    val conj_primaria = alumnos_primaria.toSet()
    val conj_secundaria = alumnos_secundaria.toSet()

    println("${conj_primaria union conj_secundaria}")
    println("${conj_primaria intersect  conj_secundaria}")
    println("${conj_primaria subtract  conj_secundaria}")
}

fun pedir_alumnos(msj: String): MutableList<String> {
    println(msj)
    var alumnos = mutableListOf<String>()
    var alumno = ""
    var cont = 0
    while (alumno != "x") {
        cont += 1
        print("$cont => ")
        alumno = readln()
        if (alumno.lowercase() != "x") {
            alumnos.add(alumno)
        }
    }
    return alumnos
}

/**
 * No he sabido hacerlo
 * fun ejercicio3_conj_3() {
    val conjunto_original = setOf<Int>(6, 1, 4)
    val lista_potencia = conjunto_potencia(conjunto_original)
    println(lista_potencia)
}

fun conjunto_potencia(conjunto_original: Set<Int>): List<Int> {
    var lista_potencia = mutableListOf<Set<String>>()
    for (elemento in conjunto_original) {
        var nuevos_subconjuntos = mutableSetOf<String>()
        for (subconjunto in lista_potencia) {
            nuevos_subconjuntos.add(elemento.toSet() union subconjunto)
        }
        lista_potencia.extend(nuevos_subconjuntos)
    }
    return lista_potencia
}*/

fun ejercicio3_conj_4() {
    val frutas1 = setOf<String>("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = setOf<String>("manzana", "pera", "durazno", "sandía", "uva")

    val frutas_comunes = (frutas1 union frutas2)
    val frutas_solo_en_frutas1 = (frutas1 subtract frutas2)
    val frutas_solo_en_frutas2 = (frutas2 subtract frutas1)

    println("Set frutas 1: $frutas1")
    println("Set frutas 2: $frutas2")
    println("Set frutas comunes: $frutas_comunes")
    println("Set frutas solo en frutas 1: $frutas_solo_en_frutas1")
    println("Set frutas solo en frutas 2: $frutas_solo_en_frutas2")
}

fun ejercicio3_conj_5() {
    val numeros = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var pares = mutableSetOf<Int>()
    var multiplos_de_tres = mutableSetOf<Int>()

    for (i in numeros) {
        if ((i % 2) == 0) {
            pares.add(i)
        }
        else if ((i % 3) == 0){
            multiplos_de_tres.add(i)
        }
    }

    val pares_y_multiplos_de_tres = (pares intersect multiplos_de_tres)

    println("Números: $numeros")
    println("Pares: $pares")
    println("Multiplos de tres: $multiplos_de_tres")
    println("Intersección pares y multiplos de tres: $pares_y_multiplos_de_tres")
}

fun ejercicio3_conj_6() {
    val vocales = setOf<String>("a", "e", "i", "o", "u")
    val consonantes = setOf<String>("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z")

    val letras_comunes = (vocales union consonantes)

    println("Letras comunes: $letras_comunes")
    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
}

