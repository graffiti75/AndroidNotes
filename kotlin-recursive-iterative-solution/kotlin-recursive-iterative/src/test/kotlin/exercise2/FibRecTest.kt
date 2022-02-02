package exercise2

import fibRec
import org.junit.Test
import kotlin.test.assertEquals

internal class FibRecTest {

    @Test
    fun fibOf2() {
        assertEquals(fibRec(2), 1)
    }

    @Test
    fun fibOf4() {
        assertEquals(fibRec(4), 3)
    }

    @Test
    fun fibOf8() {
        assertEquals(fibRec(8), 21)
    }

    @Test
    fun fibOf16() {
        assertEquals(fibRec(16), 987)
    }
}