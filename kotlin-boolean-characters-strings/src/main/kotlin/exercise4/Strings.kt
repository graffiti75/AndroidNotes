package exercise4

/**
 - How can we initialize a string with multiple lines?
 - How can we remove blank space characters from a string, from its beginning and its end?
 - How can we compare 2 strings in Kotlin?
 */

// How can we initialize a string with multiple lines?
var string = """
        Hello,
        My name is Marie Curie.
        How are you?
    """

// How can we remove blank space characters from a string, from its beginning and its end?
var anotherString = "   Hello, my name is Marie Curie, how are you?   ".trim()

// How can we compare 2 strings in Kotlin?
// --- Using the method compareTo().
// --- If its output is negative, the first string is smaller than the second.
// --- If its output is positive, the first string is greater than the second.
// --- If its output is equal, the first string is equal than the second.
var string1 = "This is a string"
var string2 = "This is another string"
var comparison = string1.compareTo(string2)

fun main() {
    println(string)
    println("[$anotherString]")
    println(comparison)
    println(string1.compareTo(string1))
    println(string2.compareTo(string1))
}