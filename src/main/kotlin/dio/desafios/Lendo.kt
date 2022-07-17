import java.io.File
fun main() {
    val fileName = "/Users/welli/OneDrive/Área de Trabalho/Exemplo.txt"
    val linesLength = File(fileName).length()
    val lines = File(fileName).readLines().size
    print("$linesLength $lines")
}