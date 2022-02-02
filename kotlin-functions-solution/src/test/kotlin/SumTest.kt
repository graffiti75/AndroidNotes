import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SumTest {

    private val testSum: Sum = Sum()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSum.sum(40, 2))
    }

    @Test
    fun testSumTwoNegativeNumbers() {
        val expected = -25
        assertEquals(expected, testSum.sum(-20, -5))
    }

    @Test
    fun testSumANegativeAndAPositiveNumber() {
        val expected = -15
        assertEquals(expected, testSum.sum(-20, 5))
    }
}
