package dio.desafios

fun main() {

    val numeroCasos = readLine()!!.toInt()
    repeat(numeroCasos) {
        val linha: String = readLine()!!
        val x = Character.getNumericValue(linha[0])
        val z = linha[1]
        val y = Character.getNumericValue(linha[2])
        if (x == y) {
            println(x * y)
        } else if (Character.isUpperCase(z)) {
            println(y - x)
        } else {
            println(x + y)
        }
    }
}