package mx.kodemia.miappkodemia

private class Smartphone(var marca: String = "", var modelo: String = "", var color: String = "",
                 var almacenamiento: String = "", var precio: Double = 0.0) {

    fun encender() {
        println("El telefono se está encendiendo...")
    }

    fun apagar() {
        println("El telefono se está apagando...")
    }

    fun imprimirData() {
        println("La marca es $marca")
        println("El modelo es $modelo")
        println("La color es $color")
        println("La almacenamiento es $almacenamiento")
        println("La precio es $precio")
    }
}

fun main() {
    val smartphone = Smartphone().apply {
        marca = "Xiaomi"
        modelo = "Redmi Note 10"
        color = "Negro"
        almacenamiento = "256GB"
        precio = 8000.0
    }

    val smartphone2 = Smartphone("Nokia", "N95", "Negro", "64MB"
            , 9000.0)

    println(smartphone.marca)
    smartphone.marca = "Samsung"
    smartphone.imprimirData()

    val listSmartphone: MutableList<Smartphone> = mutableListOf()
    listSmartphone.add(smartphone)
    listSmartphone.add(smartphone2)
    listSmartphone.add(Smartphone("Alcatel", "Pixi", "Negro", "64MB"
            , 7000.0))
    listSmartphone.add(Smartphone("Google", "Pixel 6", "Blanco", "1TB"
            , 23000.0))

    for (smart in listSmartphone){
        println(smart.imprimirData())
    }
}

/* Hacer un programa con entrada de información (teclado) ocupando lo siguiente:
    Pueden modelar el objeto que gusten (Libros, Animales, Laptops, Silla, Mesa)
    - Class
    - Funciones
    - Ciclo (Do While)
        - Imprimir algún dato
        - Agregar información
*/