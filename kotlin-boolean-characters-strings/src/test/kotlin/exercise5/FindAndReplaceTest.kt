package exercise5

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class FindAndReplaceTest {

    private lateinit var text1: String
    private lateinit var text2: String

    @Before
    fun setup() {
        text1 = " Ana and Morgana likes to eat 4 bananas each 3 hours "
        text2 = "To be or not to be, that's the question"
    }

    @Test
    fun findAndReplaceReturnsTrue() {
        val find = findAndReplace(text1, key = "ana")
        assertEquals(find, 2)
    }

    @Test
    fun findAndReplaceReturnsFalse() {
        val find = findAndReplace(text2, key = "o be")
        assertNotEquals(find, -1)
    }
}