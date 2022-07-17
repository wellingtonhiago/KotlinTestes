package dio.desafios

// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main() {
    val numA = readLine()!!.toInt()
    val numB = readLine()!!.toInt()
    var soma = 0

    if (numA < numB){
        for (i in numA..numB) {
            if (i % 13 != 0) soma += i
        }
    } else {
        for (i in numB..numA) {
            if (i % 13 != 0) soma += i
        }
    }
    println(soma)
}