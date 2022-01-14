package mx.kodemia.miappkodemia

fun main() {
    val smartphonePOO = SmartphonePOO()
//    smartphonePOO.encender()
    val nokia = Nokia().apply {
        marca = "Nokia"
        modelo = "5300"
        color = "Blanco con rojo"
        almacenamiento = "32 MB"
        precio = 5300.00
    }
//    nokia.indestructibles()
//    nokia.imprimirData()
//    nokia.encender()

    val xiaomi = Xiaomi()
    xiaomi.imprimirSaludo()
    xiaomi.imprimirDespedida()
}

class Nokia : SmartphonePOO() {
    val bateriaInfinita: String = ""
    fun indestructibles() {
        println("Mi ${marca} es indestructible")
    }

    override var marca: String
        get() = super.marca
        set(value) {}

    override fun encender() {
        println("El telefono se está encendiendo otra vez...")
    }
}

open class SmartphonePOO(open var marca: String = "", var modelo: String = "", var color: String = "",
                         var almacenamiento: String = "", var precio: Double = 0.0) {

    open fun encender() {
        println("El telefono se está encendiendo...")
    }

    protected fun apagar() {
        println("El telefono se está apagando...")
    }

    private fun imprimirData() {
        println("La marca es $marca")
        println("El modelo es $modelo")
        println("La color es $color")
        println("La almacenamiento es $almacenamiento")
        println("La precio es $precio")
    }
}

abstract class MiSmartphone(){
    abstract fun imprimirSaludo()

    fun imprimirDespedida() {
        println("Hasta luego koders")
    }
}

class Xiaomi : MiSmartphone() {

    override fun imprimirSaludo() {
        println("Hola Koders")
    }

}

class MiTelefono() : MiMoto, MiSamsung {

    override fun imprimiSaludo() {

    }

    override fun imprimirSaludo(mensaje: String) {
        TODO("Not yet implemented")
    }

    override fun imprimirSaludoConRetorno(mensaje: String): String {
        TODO("Not yet implemented")
    }

    override fun imprimir(mensaje: String) {
        super<MiMoto>.imprimir(mensaje)
        super<MiSamsung>.imprimir(mensaje)
    }

}

interface MiMoto {
    fun imprimiSaludo()
    fun imprimirSaludo(mensaje: String)
    fun imprimirSaludoConRetorno(mensaje: String) : String

    fun imprimir(mensaje: String) {
        println("Hola ${mensaje}")
    }
}

interface MiSamsung {
    fun imprimiSaludo()
    fun imprimirSaludo(mensaje: String)
    fun imprimirSaludoConRetorno(mensaje: String) : String
    fun imprimir(mensaje: String) {
        println("Hola ${mensaje}")
    }
}