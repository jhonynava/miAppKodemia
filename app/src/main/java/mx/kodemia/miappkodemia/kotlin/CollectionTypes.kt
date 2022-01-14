package mx.kodemia.miappkodemia

fun main() {
    //array()
    //myArrayList()
    myMap()
    //myList()
    mySet()
    controlIf()
}

fun sumar(n1: Int, n2: Int){
    controlIf()
    fun validarNumero(){

    }
}


// Arreglos
fun array() {
    // Declaro un arreglo de tipo String y le asigno valores
    val myArray: Array<String> = arrayOf<String>("Kodemia", "Android", "Bootcamp")
    // Arreglo de tipo String Null Safety, de tamaño 10 y cada elemento que tiene es nulo
    val myArraySafety: Array<String?> = arrayOfNulls<String>(10)
    imprimirArray(myArray)
    imprimirArraySafety(myArraySafety)

    // Modificar un elemento
    myArray.set(0, "Koder")
    myArray[1] = "Kotlin"
    imprimirArray(myArray)
}

// Recorrer un arreglo
fun imprimirArray(myArray: Array<String>) {
    for (array in myArray) {
        println(array)
    }
}

// Recorrer un arreglo con tipo de dato null safety
fun imprimirArraySafety(myArray: Array<String?>) {
    for (array in myArray) {
        println(array)
    }
}

fun myArrayList() {
    // Declarar ArrayList
    var myArrayList = arrayListOf<String>()

    // Agregar un elemento
    myArrayList.add("Kodemia")
    myArrayList.add("Android")
    myArrayList.add("Mentor")

    // Se puede cambiar el nombre de it, por el que sea pero se tiene que poner así varible -> println(variable)
    myArrayList.forEach {
        println(it) // it representa el elemento del arraylist que se esta iterando
    }

    myArrayList.addAll(listOf("Jhona", "Humberto", "Backbase"))
    myArrayList.forEach {
        println(it)
    }

    // Acceso a un elemento del arraylist
    val dato1 = myArrayList.get(5)
    val dato2 = myArrayList[4]
    println("Mi dato es $dato1")
    println("Mi dato es $dato2")

    // Eliminar un elemento
    myArrayList.removeAt(5)
    // Con forEach se recorre el arreglo
    myArrayList.forEach {
        println(it)
    }
    controlIf()
}

fun myMap() {
    // Declarción de un map con clave tipo String y valor tipo Entero
    var myMap: Map<String, Int> = mapOf()
    // Para agregar datos el tipo de funcion debe ser mutable, de lo contrario no se podran agregar datos
    myMap = mutableMapOf("Kodemia" to 1, "Android" to 2, "Mentor" to 3)
    // Agregar un elemento al map
    myMap.put("Koder", 4)
    myMap["Kotlin"] = 5
    // Recorrer el map
    myMap.forEach {
        println("Clave = ${it.key} - Valor = ${it.value}")
    }
    // Acceder a un elemento del map
    println("La clave del elemento es : ${myMap["Kodemia"]}")

    // Modificar elemento del map se tiene que poner la misma clave y colocar el valor que deseen
    myMap.put("Kodemia", 7)
    myMap.forEach {
        println("Clave = ${it.key} - Valor = ${it.value}")
    }
}

fun myList() {
    // Declarar una list
    var myList = listOf<String>()
    // Se declara una lista mutable de lo contrario no se puede agregar
    myList = mutableListOf("Kodemia", "Android", "Mentor")
    // Se agrega un elemento a la lista
    myList.add("koder")
    // Recorrer una lista
    myList.forEach {
        println(it)
    }
    // Acceder a un elemento de una lista
    val dato1 = myList.get(0)
    val dato2 = myList[1]
    println("El dato1 es $dato1")
    println("El dato2 es $dato2")

    // Modificar un elemento
    myList[0] = "Koder"

    // Eliminar un dato de un elemento
    myList.remove("koder")

    // Recorrer una lista
    myList.forEach {
        println(it)
    }
}

fun mySet() {
    // Declarar un set
    var mySet = setOf<String>()
    // Para agregar datos se tiene que hacer un set mutable
    mySet = mutableSetOf("Kodemia", "Android", "Mentor")

    // Agregando datos a set, no se puede tener datos iguales
    mySet.add("Kotlin")

    println(mySet.size)
    mySet.forEach {
        println(it)
    }

    // Acceder a un elemento
    println(mySet.elementAt(0))

    // Eliminar un elemento
    println("Se elimina el elemento kodemia")
    mySet.remove("Kodemia")
    mySet.forEach {
        println(it)
    }
}