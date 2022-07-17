package dio.desafios

fun main() {
    repeat(3){
        val numeroTartarugas = readLine()!!
        val velocidadeTartarugas = readLine()!!.split(" ").map{ it.toInt() }.toTypedArray()
        var max = velocidadeTartarugas[0]

        for (num in velocidadeTartarugas) {
            if (max < num) max = num
        }

        when {
            max < 10 -> println(1)
            max in 10..19 -> println(2)
            max >= 20 -> println(3)
        }
    }
}