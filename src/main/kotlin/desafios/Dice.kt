package desafios

fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 5

    when (rollResult) {
        luckyNumber -> println("You win!")
        else -> println("You didn't win, try again!")
    }



}

class Dice(val numSides: Int) {

    fun roll(): Int = (1..numSides).random()
}