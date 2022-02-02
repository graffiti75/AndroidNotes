package exercise2

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class YearIsLeapTest {

    @Test
    fun checkIfYear2000IsLeap() {
        assertEquals(isLeapYear(2000), true)
    }

    @Test
    fun checkIfYear2004IsLeap() {
        assertEquals(isLeapYear(2004), true)
    }

    @Test
    fun checkIfYear1900IsLeap() {
        assertNotEquals(isLeapYear(1900), true)
    }

    @Test
    fun checkIfYear1904IsLeap() {
        assertEquals(isLeapYear(1904), true)
    }
}