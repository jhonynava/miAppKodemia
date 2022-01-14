package mx.kodemia.miappkodemia

fun main() {
    // Variables mutables
    var nombre: String = "Edwin"
    nombre = "Sora"
    println(nombre)

    // Varaibles inmutables (Constantes)
    val edad1: Int = 27

    // Tipos enteros (Byte, Short, Int, Long)
    val numeroByte: Byte = 1
    val numeroShort: Short = 2345
    val numeroInt: Int = 4864574
    val Long: Long = 5465465441

    // Decimales (Float, Double)
//    val numeroFloat: Float = 1.1f
//    val numeroDouble: Double = 1.9
//    val numeroRandom = 2
//    val numeroSumado = numeroDouble + numeroRandom
//    println(numeroSumado)

    // Boleanos (Boolean)
//    val numeroBolean: Boolean = true
//    val numeroBolean2: Boolean = true
//    val numeroBolean3: Boolean = false
//    println(numeroBolean == numeroBolean2)
//    println(numeroBolean == numeroBolean3)

    // Caracter (Char)
//    val miCaracter: Char = 'a'

    // Cadena (String)
//    val miTexto: String = "Kodemia"

    // Null Safety
    // Incorrecto
//    var varSinNullSafety: String = "Kodemia"
//    varSinNullSafety = null

    // Correcto
//    var varNullSafety: String? = "Kodemia"
//    varNullSafety =  llamadaRest() // La respuesta de la función es nula
//    println("El valor es: $varNullSafety")
//    varNullSafety = "Kodemia"
//    println("El valor asignado es: $varNullSafety")
//
//    var numeroNullSafety: Int? = null
//    println(numeroNullSafety)
//
//    var llamadaNormal: Int = if (varNullSafety != null) varNullSafety.length else 0
//    println("Llmada normal= $llamadaNormal")

//    val operadorElvis = varNullSafety?.length ?: 0
//    println("Operador de Elvis= $operadorElvis")
//
//    val numSafety: String? = null
//    println(numSafety?.length ?: "El contenido de la variable data es null")
//    println(numSafety!!.length)

}

fun llamadaRest(): String? {
    val texto: String? = null
    // numero = Operacion de validación
    return texto
}