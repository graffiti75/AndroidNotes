package exercise3

import org.junit.Test
import kotlin.test.assertEquals

internal class CountOccurrencesTest {

    @Test
    fun checkFirstString() {
        val number = countOccurrences("To be or not to be, that's the question.")
        assertEquals(number, 1)
    }

    @Test
    fun checkSecondString() {
        val number = countOccurrences("Write a function to count the number of occurrences of a character.")
        assertEquals(number, 4)
    }
}