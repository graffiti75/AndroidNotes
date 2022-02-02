package exercise3

/**
 * Write a function to count the number of occurrences of a character like 'a' inside a string text.
 */
fun countOccurrences(text: String, character: Char = 'a'): Int = text.filter { it == character }.length

fun main() {
    println(countOccurrences("To be or not to be, that's the question."))
    println(countOccurrences("Write a function to count the number of occurrences of a character."))
}