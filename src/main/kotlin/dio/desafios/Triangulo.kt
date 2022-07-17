package dio.desafios

import kotlin.reflect.typeOf

fun main() {
    val numbers = readLine()!!.split(" ")
    
    val ladoA = numbers[0].toDouble()
    val ladoB = numbers[1].toDouble()
    val ladoC = numbers[2].toDouble()


    val perimetro = ladoA + ladoB + ladoC
    val area = ((ladoA+ladoB)*ladoC)/2

    if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA)
        println("Perimetro = ${perimetro.format(1)}")
        else println("Area = ${area.format(1)}")

}

fun Double.format(digitos: Int) = "%.${digitos}f".format(this)