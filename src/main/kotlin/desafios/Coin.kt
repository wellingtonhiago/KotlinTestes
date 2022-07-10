package desafios

fun main() {

    val firstCoin = Coin()
    println("A moeda deu: ${firstCoin.tossCoin()}")

}

class Coin {
    val moeda = setOf("Cara", "Coroa")

    fun tossCoin(): String = moeda.random()
}