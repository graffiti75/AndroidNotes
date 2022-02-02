package exercise4

import combineArrays
import concatenateAnyArrays
import concatenateArrays
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class CombineDifferentTypeArraysTest {

    private lateinit var first: Array<Int>
    private lateinit var second: Array<Char>
    private lateinit var combined: Array<Any>

    @Before
    fun setup() {
        first = arrayOf(1, 2, 3)
        second = arrayOf('a', 'b', 'c')
        combined = combineArrays(first, second)
    }

    @Test
    fun combineArraysAppendedArraysCorrectly() {
        assertTrue(combined[0] == 1 && combined[combined.size - 1] == 'c')
    }

    @Test
    fun combineArraysIncreasedArraySize() {
        assertEquals(combined.size, first.size + second.size)
    }
}