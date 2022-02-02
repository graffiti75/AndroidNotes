package exercise2

/**
 * Write a function that detects if a year is Leap.
 */
fun isLeapYear(year: Int): Boolean {
    var leap = false
    val divisibleBy4 = year % 4 == 0
    val divisibleBy100 = year % 100 == 0
    val divisibleBy400 = year % 400 == 0

    if (divisibleBy4) {
        leap = if (divisibleBy100)
            divisibleBy400 // year is divisible by 400, hence the year is a leap year
        else true
    }
    return leap
}

fun main() {
    println(isLeapYear(2000))
    println(isLeapYear(2004))
    println(isLeapYear(1900))
    println(isLeapYear(1904))
}