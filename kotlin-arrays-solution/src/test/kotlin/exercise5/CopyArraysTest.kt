package exercise5

import copyArrays
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class CopyArraysTest {

    private lateinit var from: Array<Int>
    private lateinit var to: Array<Int>

    @Before
    fun setup() {
        from = arrayOf(6, 7, 5, 2, 4)
        to = copyArrays(from)
    }

    @Test
    fun copyArraysAppendedArraysCorrectly() {
        assertTrue(from[0] == to[0] && from[from.size - 1] == to[to.size - 1])
    }

    @Test
    fun copyArraysIncreasedArraySize() {
        assertEquals(from.size, to.size)
    }
}