/**
Exercise 5. Copy arrays in Kotlin

- Write a function `copyArrays` that copy the content of one array to another, and return this another array
- Write a Unit Test for `copyArrays`
*/

fun <T> copyArrays(arr: Array<T>): Array<T> = arr.clone()

fun main() {
    val from = arrayOf(6, 7, 5, 2, 4)
    val to = copyArrays(from)
    println(to.contentToString())
}