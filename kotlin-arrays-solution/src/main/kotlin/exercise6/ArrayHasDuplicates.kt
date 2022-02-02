/**
Exercise 6. Check for duplicates in an array in Kotlin

- Write a function `hasDuplicates` that check if one array has a duplicated item (this function returns a boolean)
- Write a Unit Test for `hasDuplicates`
*/

// Kotlin has a distinct() function, which returns a list of distinct elements present in the array.
// If the count of the returned array is not equal to the original array's length,
// you can say that the array contains a repeated element.

fun <T> hasDuplicates(arr: Array<T>): Boolean {
    return arr.size != arr.distinct().count()
}

fun main() {
    val arr: Array<Int> = arrayOf(4, 6, 8, 3, 4)
    if (hasDuplicates(arr)) {
        println("Repeated elements found")
    } else {
        println("No repeated elements found")
    }
}