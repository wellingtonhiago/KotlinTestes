import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.reflect.typeOf

fun main() {

    val num = 3
    if (num > 4) println("The variable is greater than 4")

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
