/**
Exercise 4. Combine two arrays of different types in Kotlin

This exercise is a challenge:

- Write a function `combineArrays` that combine two arrays of different types and return its concatenation
- Write a Unit Test for `combineArrays`
*/

import java.util.*
import java.util.stream.Stream

fun <T, U> combineArrays(first: Array<T>, second: Array<U>): Array<Any> {
    return Stream.concat(Arrays.stream(first), Arrays.stream(second))
        .toArray()
}

fun main() {
    val first = arrayOf(1, 2, 3)
    val second = arrayOf('a', 'b', 'c')

    val combined = combineArrays(first, second)
    println(combined.contentToString())
}