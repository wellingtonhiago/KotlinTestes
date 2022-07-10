fun main() {

    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var valor = readLine()!!.toInt()
    val totalNotas = IntArray(7)
    println("$valor")

    for (i in 0..(notas.size - 1)) {
        if (valor >= notas[i]) {
            totalNotas[i] = valor / notas[i]
            valor = valor - totalNotas[i] * notas[i]
            println("${totalNotas[i]} nota(s) de R$ " + notas[i] + ",00")
        } else {
            println("0 nota(s) de R$ " + notas[i] + ",00")
        }
        valor = valor % notas[i]
    }
}