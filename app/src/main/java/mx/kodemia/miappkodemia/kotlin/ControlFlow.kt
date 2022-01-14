package mx.kodemia.miappkodemia

import java.lang.NumberFormatException

fun main() {
    //controlIf()
    //controlFor()
    //controlWhen()
    controlWhile()
    //controlDoWhile()
    //calculadora()
}

fun controlIf() {
    val num1: Int
    println("Inserte un numero")
    num1 = try {
        readLine()!!.toInt()         // Lo insertado en la consola se convertira en entero siempre y cuando no sea nulo
    } catch (_: NumberFormatException) {
        0
    }
    println("Inserte un segundo numero")
    val num2 = try {
        readLine()!!.toInt()         // Lo insertado en la consola se convertira en entero siempre y cuando no sea nulo
    } catch (_: NumberFormatException) {
        0
    }
    if (num1 > num2) {
        println("El numero $num1 es mayor a $num2")
    } else {
        println("El numero $num1 es menor a $num2")
    }
}

fun koderw() {
    println("¡Hola Koders!")
}

fun controlFor() {
    println("Recorrido del for con rango de 0 a 10")
    for (num in 0..10) {
        println(num)
    }

    println("Recorrido del for con rango de 0 a 5, sin contemplar el último número (5)")
    for (num in 0 until 5) {
        println(num)
    }

    println("Recorrido del for con rango de 0 a 10 con incremento en 5")
    for (num in 0..25 step 5) {
        println(num)
    }

    println("Recorrido del for con rango de 20 a 0 con decremento en 5")
    for (num in 20 downTo 0 step 5) {
        println(num)
    }

    val array = arrayOf("Jesus", "Humberto", "Edwin")
    println("Indices: ${array.indices}")

    println("Recorrido de array")
    for (i in array.indices) {
        println(array[i])
    }

    println("Recorrido de array desestructurando el elemento")
    for ((index, value) in array.withIndex()) {
        println("El elemento $index es $value")
    }
}

fun controlWhen() {
    println("Ingresa tu edad")
    val edad = readLine()!!.toInt()
    when (edad) {       // Variable a evaluar
        in 0..12 -> println("Eres un niño")
        in 13..17 -> println("Eres un adolescente")
        in 18..59 -> println("Eres un adulto")
        in 60..150 -> println("Eres una persona de la tercera edad")
        else -> {
            println("No existes o ya estas muerto")
        }
    }

    println("Ingresa tu estado")
    val estado = readLine().toString()
    when (estado) {
        "CDMX" -> println("Eres chilango")
        "Jalisco" -> println("Eres jalisquillo")
        "Chihuahua" -> println("Eres chihuahuitas")
        else -> println("No tenemos registrado tu estado en la BD")
    }
}

fun controlWhile() {
//    var num = 0
//    while (num<5){
//        println(num)
//        num++
//    }
    val numbers = mutableListOf("correo@gmail.com", "Jhonattan Romano")
    numbers.first().let {
        if (it.contains('@')){
            numbers.add("Valido")
        }
    }
    println(numbers)

    val resultado = "Hola".run {
        println("El String $this tiene $length caracteres")
    }

    val prom = run {
        val num1 = 10
        val num2 = 10
        num1/num2
    }
    println("El promedio es $prom")

    val koders = mutableListOf("Sora", "Sael", "Somilleda")
    with(koders) {
        println("Se inicializa con los datos $this")
        println("El tamaño de la lista es $size")
    }

    var saludo: String? = null
    saludo?.let {
        println(saludo)
    }
}


fun controlDoWhile() {
    var num = 0
    do {
        println(num)
        num++
    } while (num<5)
}

private fun calculadora() {
    var num: Int? = null

    do {
        println("Calculadora")
        println("Menu ")
        println("1 -> SUMA ")
        println("2 -> RESTA ")
        println("3 -> MULTIPLICACIÓN ")
        println("4 -> DIVISIÓN ")
        println("5 -> SALIR ")
        println("¿Qué deseas hacer?")
        num = try {
            readLine()?.toInt()
        } catch (_: NumberFormatException) {
            0
        }
        when (num) {
            1 -> suma()
            2 -> resta()
            3 -> multiplicacion()
            4 -> division()
            5 -> println("Hasta luego koder...")
            else -> {
                println("Número invalido")
            }
        }
    } while (num != 5)
}

fun suma() {
    println("Ingrese el primer número: ")
    val num1: Int? = readLine()?.toInt()
    println("Ingrese el segundo número: ")
    var num2: Int? = readLine()?.toInt()
    val suma = num2?.let { num1?.plus(it) }
    println("La suma es: $suma")
}

fun resta() {
    println("Ingrese el primer número: ")
    val num1: Int? = readLine()?.toInt()
    println("Ingrese el segundo número: ")
    val num2: Int? = readLine()?.toInt()
    val resta = num2?.let { num1?.minus(it) }
    val resta2 = num2!! - num1!!
    println("La resta es: $resta")
}

fun multiplicacion() {
    println("Ingrese el primer número: ")
    val num1: Int? = readLine()?.toInt()
    println("Ingrese el segundo número: ")
    val num2: Int? = readLine()?.toInt()
    val multi = num2?.let { num1?.times(it) }
    println("La multiplicación es: $multi")
}

fun division() {
    println("Ingrese el primer número: ")
    val num1: Int? = readLine()?.toInt()
    println("Ingrese el segundo número: ")
    val num2: Int? = readLine()?.toInt()
    val division = num2?.let { num1?.div(it) }
    println("La división es: $division")
}