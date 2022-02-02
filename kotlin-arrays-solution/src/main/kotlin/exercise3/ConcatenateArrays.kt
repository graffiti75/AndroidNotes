/**
Exercise 3. Concatenate two arrays in Kotlin

- Write a function `concatenateArrays` that combine two `IntArray`'s and return its concatenation
- Write a Unit Test for `concatenateArrays`
- As a challenge, try to implement a generic function called `concatenateAnyArray`, that combine two arrays `Array<T>` and return its concatenation
*/

fun concatenateArrays(a: IntArray, b: IntArray): IntArray = a + b
fun <T> concatenateAnyArrays(a: Array<T>, b: Array<T>): Array<T> = a + b

fun main() {
    val a = intArrayOf(1, 2, 3)
    val b = intArrayOf(4, 5)
    val concat = concatenateArrays(a, b)
    println(concat.contentToString())

    val c = arrayOf("a", "b", "c")
    val d = arrayOf("d", "e")
    val concatAny = concatenateAnyArrays(c, d)
    println(concatAny.contentToString())
}