package exercise1

import fib
import org.junit.Test
import kotlin.test.assertEquals

internal class FibTest {

    @Test
    fun fibOf2() {
        assertEquals(fib(2), 1)
    }

    @Test
    fun fibOf4() {
        assertEquals(fib(4), 3)
    }

    @Test
    fun fibOf8() {
        assertEquals(fib(8), 21)
    }

    @Test
    fun fibOf16() {
        assertEquals(fib(16), 987)
    }
}