package mx.kodemia.miappkodemia

fun main() {
//    functionLet()
//    functionRun()
//    functionWith()
//    functionApply()
    functionAlso()
}

fun functionLet() {
    val koderSael = mutableListOf("correo@gmail.com", "Sael")
    koderSael.first().let {
        if (it.contains('@')) {
            koderSael.add("Valido con let")
        }
    }
    koderSael.first().run {
        if (this.contains('@')) {
            koderSael.add("Valido con run")
        }
    }
    println(koderSael)

    val saludo: String? = null
    val tamani = saludo?.let {
        it.length
    } ?: 0
//    println(tamanio)
}

fun functionRun() {
    // Con lambda
    val saludo = "Hola Koders".run {
        println("El String $this tiene $length caracteres")
    }

    // Sin lambda
    val prom = run {
        val n1 = 20
        val n2 = 21
        n1 / n2
    }
    println("El promedio es $prom")
}

fun promedio(n1: Int, n2: Int) = n1 / n2

fun functionWith() {
    val koders = mutableListOf("Sora", "Jesus", "Ale")
    with(koders) {
        println("Se inicializa con los datos $this")
        println("El tamaño de la lista es $size")
    }

    val first = with(koders) {
        this.first()
    }
    println("El primer el elemento es $first")
}

fun functionApply() {
//    val koderRobe = koder("Robert").apply {
//        edad = 31
//        ciudad = "GDL"
//    }.toString()
//    println(koderRobe)
}

fun functionAlso() {
//    val koderRobe = koder("Robert")
//    koderRobe.apply {
//        edad = 31
//        ciudad = "GDL"
//    }.also { println("El que se animo a participar fue ${it.nombre}") }
    val sael = koder("", 0, "").apply {
        nombre="Sael"
    }.also {
        println(it)
    }
}

data class koder(var nombre: String, var edad: Int, var ciudad: String)
