package dio.desafios

fun main() {
    val n = readLine()!!.toInt()
    var fibo1 = 0
    var fibo2 = 1

    for (i in 1..n) {
        print("$fibo1 ")

        val sum = fibo1 + fibo2
        fibo1 = fibo2
        fibo2 = sum
    }

}