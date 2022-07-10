import java.math.BigInteger.ONE
import kotlin.math.absoluteValue

fun main() {
    val str1 = "aaabbcccdaa"
    var str2 = " "

    for (ch in str1) {
        if (ch != str2.last()) {
            str2 += ch
            println(str2)
        }
    }
}
internal fun twofer(name: String = "you") = "One for $name, one for me."

fun printBorder(border: String, timesToRepeat: Int) = print(border.repeat(timesToRepeat))

fun transform(color: String) = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}

fun isRightEquation(a: Int, b: Int, c: Int) = a * b == c

fun isVowel(letter: Char) = letter.lowercase() in "aeiou"

fun getLastDigit(number: Int) = number.absoluteValue % 10

fun isGreater(number1: Int,
              number2: Int,
              number3: Int,
              number4: Int) = (number1 + number2) > (number3 + number4)

fun roll(): Int = (1..6).random()
fun fishFood (day : String) = when (day) {  "Monday" -> "flakes"
                                            "Tuesday" -> "pellets"
                                            "Wednesday" -> "redworms"
                                            "Thursday" -> "granules"
                                            "Friday" -> "mosquitoes"
                                            "Saturday" -> "lettuce"
                                            "Sunday" -> "plankton"
                                            else -> "No day, No food"
}
fun randomDay() : String = week[(0..week.size).random()]
    val week = arrayOf ("Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday")

fun feedTheFish() = println ("Today is ${randomDay()} and the fish eat ${fishFood(randomDay())}")

fun testeFiltro(){
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {'g' in it})
    println( decorations.filter {it[0] == 'p'})
}

fun f(x: Double): Double {
    return when {
        x <= 0.0 -> f1(x)
        0 < x && x < 1 -> f2(x)
        else -> f3(x)
    }
}

fun f1(y: Double): Double = (y * y) + 1

fun f2(y: Double): Double = 1 / (y * y)

fun f3(y: Double): Double = (y * y) - 1

class Size(val width: Int, val height: Int) {
    init {
        println("Initializer block that prints the width ($width) and the height ($height)")
    }
}

class Patient(val name: String) {
    fun say() = println("Hello, my name is $name, I need a doctor.")
}

// Classe interna
class Cat(val name: String) {
    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String) {
        fun putOnABow() {
            sayMeow()
            println("The bow is on!")
        }

        fun printColor() {
            println("The cat named $name has a $color bow.")
        }
    }
}

class Pumpkin(val type: String, val isForHalloween: Boolean) {

    fun addCandle() = if (isForHalloween) Candle().burning() else println("We don't need a candle.")

    inner class Candle {
        fun burning() = println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
    }
}