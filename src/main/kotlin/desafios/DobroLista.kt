fun main() {
    var inicializador = readLine()!!.toInt()
    var vetor = IntArray(10)

    for (i in 0..vetor.lastIndex) {
        vetor[i] = inicializador
        inicializador = inicializador * 2
        println("N[$i] = ${vetor[i]}")
    }
}