package dio.desafios

fun main() {
    val numeroTestes = readLine()!!.toInt()

    repeat(numeroTestes){
        val raios = readLine()!!.split(" ").map{ it.toInt() }
        val r1 = raios[0]
        val r2 = raios[1]

        println(r1 + r2)
    }
}