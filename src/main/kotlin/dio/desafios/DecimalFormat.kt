import java.text.DecimalFormat

fun main(){

    val pesoA = 3.5
    val pesoB = 7.5
    var totalPeso = 11.0

    val notaA = readln().toDouble() * pesoA
    val notaB = readln().toDouble() * pesoB

    val media = (notaA + notaB) / totalPeso

    println("MEDIA = ${media.format(5)}")
    // ou usando import Java
    val decimal = DecimalFormat("00.000.00000")
    val media2 = decimal.format(media)
    println("MEDIA = $media")
}

fun Double.format(digitos: Int) = "%.${digitos}f".format(this)