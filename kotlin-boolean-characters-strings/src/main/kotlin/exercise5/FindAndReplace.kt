package exercise5

/**
- Write a function findAndReplace that:
    - Find a key string inside the text " Ana and Morgana likes to eat 4 bananas each 3 hours " (in this case its default value will be "ana").
    - To make it easy for you, before making the research, turn everything in uppercase strings (both the text and the key).
    - If you didn't find, return -1.
    - Remove all blank spaces from this text.
    - Replace this key by the string "apple".
    - Print this new string.
    - Count the number of digits into the new string and return this number.
- Write also a Unit Test.
 */

private val TEXT = " Ana and Morgana likes to eat 4 bananas each 3 hours "
private val REPLACE = "apple"

fun findAndReplace(text: String = TEXT, key: String = "ana"): Int {
    val found = text.uppercase().contains(key.uppercase())
    println("found: $found")
    if (found) {
        var newText = text.trimStart().trimEnd()
        newText = newText.replace(key, REPLACE)
        println(newText)
        return newText.filter { it.isDigit() }.length
    }
    return -1
}

fun main() {
    println(findAndReplace(key = "ana"))
    println(findAndReplace("To be or not to be, that's the question", "o be"))
}