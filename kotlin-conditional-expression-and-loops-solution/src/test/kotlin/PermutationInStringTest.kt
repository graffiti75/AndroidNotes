import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PermutationInStringTest {

    private val underTest: PermutationInString = PermutationInString()

    @Test
    fun testFindSinglePermutation() {
        assertTrue(underTest.checkInclusion("ab", "eidbaooo"))
    }

    @Test
    fun testDoesNotFindPermutation() {
        assertFalse(underTest.checkInclusion("ab", "eidboaoo"))
    }

    @Test
    fun testSingleEmptyStrings() {
        assertTrue(underTest.checkInclusion("", ""))
    }
}