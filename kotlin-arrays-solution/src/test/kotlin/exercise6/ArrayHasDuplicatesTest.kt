package exercise6

import hasDuplicates
import org.junit.Before
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ArrayHasDuplicatesTest {

    private lateinit var arrHasDuplicates: Array<Int>
    private lateinit var arrDoesNotHaveDuplicates: Array<Int>

    @Before
    fun setup() {
        arrHasDuplicates = arrayOf(4, 6, 8, 3, 4)
        arrDoesNotHaveDuplicates = arrayOf(4, 6, 8, 3, 9, -1, 0, 2)
    }

    @Test
    fun hasDuplicatesReturnsTrue() {
        assertTrue(hasDuplicates(arrHasDuplicates))
    }

    @Test
    fun hasDuplicatesReturnsFalse() {
        assertFalse(hasDuplicates(arrDoesNotHaveDuplicates))
    }
}