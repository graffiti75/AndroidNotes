package exercise3

import concatenateAnyArrays
import concatenateArrays
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class ConcatenateArraysTest {

    private lateinit var a: IntArray
    private lateinit var b: IntArray

    private lateinit var c: Array<String>
    private lateinit var d: Array<String>

    private lateinit var intArrayConcatenated: IntArray
    private lateinit var stringArrayConcatenated: Array<String>

    @Before
    fun setup() {
        a = intArrayOf(1, 2, 3)
        b = intArrayOf(4, 5)

        c = arrayOf("a", "b", "c")
        d = arrayOf("d", "e")

        intArrayConcatenated = concatenateArrays(a, b)
        stringArrayConcatenated = concatenateAnyArrays(c, d)
    }

    @Test
    fun concatenateArraysAppendedArraysCorrectly() {
        assertTrue(intArrayConcatenated[0] == 1 && intArrayConcatenated[intArrayConcatenated.size - 1] == 5)
    }

    @Test
    fun concatenateArraysIncreasedArraySize() {
        assertEquals(intArrayConcatenated.size, a.size + b.size)
    }

    @Test
    fun concatenateAnyArraysAppendedArraysCorrectly() {
        assertTrue(stringArrayConcatenated[0] == "a" && stringArrayConcatenated[stringArrayConcatenated.size - 1] == "e")
    }

    @Test
    fun concatenateAnyArraysIncreasedArraySize() {
        assertEquals(stringArrayConcatenated.size, c.size + d.size)
    }
}