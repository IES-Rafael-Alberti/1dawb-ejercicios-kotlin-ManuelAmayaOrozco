fun ejercicio3_dicc_3() {
    print(Fruteria())
}

fun Fruteria(): String {
    var tot = 0
    val fruteria = mutableMapOf("Plátano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    print("Elige una fruta a comprar (Plátano, Manzana, Pera, Naranja): ")
    val selec = readln()
    print("¿Cuántos kilos quieres comprar?: ")
    val kilo = readln().toInt()

    when (selec) {
        "Plátano" -> {
            val precio = fruteria["Plátano"]
            if (precio != null) {
                tot = (precio * kilo).toInt()
            }
        }
        "Manzana" -> {
            val precio = fruteria["Manzana"]
            if (precio != null) {
                tot = (precio * kilo).toInt()
            }
        }
        "Pera" -> {
            val precio = fruteria["Pera"]
            if (precio != null) {
                tot = (precio * kilo).toInt()
            }
        }
        "Naranja" -> {
            val precio = fruteria["Naranja"]
            if (precio != null) {
                tot = (precio * kilo).toInt()
            }
        }
        else -> {
            println("Opción no válida.")
        }
    }
    return ("El precio total es de ${"%.2f".format(tot)}€.")
}

fun ejercicio3_dicc_5() {
    print(creditAsignaturas())
}

fun creditAsignaturas() {
    var tot = 0
    var seguir = false
    var asignaturas = mutableMapOf<String,Int>()
    while (seguir != true) {
        var (asig, credit) = pedirAsigCredit()
        asignaturas[asig] = credit
        print("¿Quieres seguir añadiendo asignaturas? (Sí para continuar): ")
        var seguirval = readln()
        if (seguirval != "Sí") {
            seguir = true
        }
    }
    for ((asig,credit) in asignaturas) {
        println("$asig tiene $credit créditos.")
        tot += credit
    }
}

fun pedirAsigCredit(): Pair<String,Int> {
    print("Introduce la asignatura deseada: ")
    val asig = readln()
    print("Introduce la cantidad de créditos que vale la asignatura: ")
    val cred = readln().toInt()
    return Pair(asig,cred)
}

fun ejercicio3_dicc_6() {
    print(personalData())
}

fun personalData(): Map<String, String> {
    var seguir = false
    var datos = mutableMapOf<String, String>()
    while (!seguir){
        print("Introduce una categoría de datos personales (O introduce '0' si no quieres introducir nada más): ")
        var catdat = readln()
        if (catdat == "0") {
            seguir = true
        }
        else {
            print("Introduce tu dato personal correspondiente de la categoría introducida: ")
            var dato = readln()
            datos[catdat] = dato
            println(datos)
        }
    }
    return datos
}

fun ejercicio3_dicc_7() {
    print(cestaCompra())
}

fun cestaCompra(): String {
    var fin = false
    var tot = 0.0
    var cesta = mutableMapOf<String, Float>()
    while (!fin) {
        print("¿Qué quieres comprar? (Introduce '0' para dejar de comprar): ")
        var prod = readln()
        if (prod == "0") {
            fin = true
        }
        else {
            print("¿Cuál es el precio del producto?: ")
            var price = readln().toFloat()
            cesta[prod] = price
            tot += price
            println("Cesta actual: $cesta")
        }
    }
    println("Cesta final: $cesta")
    return ("El precio final de la compra es ${"%.2f".format(tot)}€")
}

fun ejercicio3_dicc_8() {
    val dic = dicEspanglish()
    print(tradFrase(dic))
    //Este está mal hecho ya que no he sabido hacerlo
}

fun dicEspanglish(): Map<String, String> {
    var fin = false
    var dic = mutableMapOf<String, String>()
    while(!fin) {
        print("Introduce una palabra y su traducción al inglés de la siguiente manera (<palabra>:<traducción>) o introduce '0' para finalizar: ")
        var palabs = readln()
        if (palabs == "0") {
            fin = true
        }
        else {
            var palabras = palabs.split(":")
            dic[palabras[0]] = palabras[1]
        }
    }
    println(dic)
    return dic
}

fun tradFrase(dic: Map<String, String>): String {
    var sent = ""
    print("Dime una frase que quieras traducir: ")
    var frase = readln()
    var sfrase = frase.split(" ")
    for (word in frase) {
        var sword = word.toString()
        sent += dic.get(sword) + " "
    }
    return (sent)
}

fun ejercicio3_dicc_10() {
    var base_datos_clientes = mutableMapOf<String, Map<String, Any>>()

    while (true) {
        println(mostrar_menu())
        print("Seleccione una opción (1-6): ")
        var opcion = readln()

        when (opcion) {
            "1" -> agregar_cliente(base_datos_clientes)
            "2" -> eliminar_cliente(base_datos_clientes)
            "3" -> mostrar_cliente(base_datos_clientes)
            "4" -> listar_clientes(base_datos_clientes)
            "5" -> listar_clientes_preferentes(base_datos_clientes)
            "6" -> {
                println("Programa terminado.")
                break
            }
            else -> print("Opción no válida. Por favor, elija una opción del 1 al 6.")
        }
    }
}

fun mostrar_menu(): String {
    println("Menú:")
    println("1. Añadir cliente")
    println("2. Eliminar cliente")
    println("3. Mostrar cliente")
    println("4. Listar todos los clientes")
    println("5. Listar clientes preferentes")
    return("6. Terminar")
}

fun agregar_cliente(base_datos: MutableMap<String, Map<String, Any>>) {
    print("Ingrese el NIF del cliente: ")
    val nif = readln()
    print("Ingrese el nombre del cliente: ")
    val nombre = readln()
    print("Ingrese la dirección del cliente: ")
    val direccion = readln()
    print("Ingrese el teléfono del cliente: ")
    val telefono = readln()
    print("Ingrese el correo del cliente: ")
    val correo = readln()
    print("¿Es cliente preferente? (Sí/No): ")
    val prefselec = readln().lowercase()
    var preferente = false
    if (prefselec == "sí") {
        preferente = true
    }

    val cliente = mapOf<String, Any>("NIF" to nif, "Nombre" to nombre, "Dirección" to direccion, "Teléfono" to telefono, "Correo" to correo, "Preferente" to preferente)

    base_datos[nif] = cliente

    println("Cliente $nombre añadido correctamente.")
}

fun eliminar_cliente(base_datos: MutableMap<String, Map<String, Any>>) {
    println("Ingrese el NIF del cliente que desea eliminar: ")
    val nif = readln()
    if (nif !in base_datos) {
        println("No se encontró un cliente con NIF $nif en la base de datos.")
    }
    else {
        base_datos.remove(nif)
        println("Cliente con NIF $nif eliminado correctamente.")
    }
}

fun mostrar_cliente(base_datos: MutableMap<String, Map<String, Any>>) {
    println("Ingrese el NIF del cliente que desea mostrar: ")
    val nif = readln()
    if (nif in base_datos) {
        val cliente = base_datos[nif]
        println("Datos del cliente:")
        println("NIF: $nif")
        println("Nombre: ${cliente?.get("Nombre")}")
        println("Dirección: ${cliente?.get("Dirección")}")
        println("Teléfono: ${cliente?.get("Teléfono")}")
        println("Correo: ${cliente?.get("Correo")}")
        println("Preferente: ${cliente?.get("Preferente")}")
    }
    else{
        println("No se encontró un cliente con NIF $nif en la base de datos.")
    }
}

fun listar_clientes(base_datos: MutableMap<String, Map<String, Any>>) {
    println("Listado de todos los clientes:")
    for ((nif, cliente) in base_datos) {
        println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
    }
}

fun listar_clientes_preferentes(base_datos: MutableMap<String, Map<String, Any>>) {
    println("Listado de clientes preferentes:")
    for ((nif, cliente) in base_datos) {
        if (cliente["Preferente"] == true) {
            println("NIF: $nif, Nombre: ${cliente["Nombre"]}")
        }
    }
}

/**
 * No he sabido hacerlo
 * fun ejercicio3_dicc_11() {
    val directorio_texto = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

    val lineas = directorio_texto.split("\n")

    val nombres_campos = lineas[0].split(";")

    var directorio_clientes = mutableMapOf<String, Map<String, Any>>()

    for (linea in lineas[1]) {
        if (linea.toString() != "") {
            var linea = linea.toString()
            val valores = linea.split(";")
            val cliente_info = mapOf<String, Any>(campo to valor)
        }
    }
}*/