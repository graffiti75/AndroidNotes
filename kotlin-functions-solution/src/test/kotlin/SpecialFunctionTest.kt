import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SpecialFunctionsTest {

    private val underTest: SpecialFunctions = SpecialFunctions()

    @Test
    fun testInitWithTwoPositiveNumber() {
        assertEquals(25, underTest.init(5, 5))
    }

    @Test
    fun testInitWithTwoPositiveNumber2() {
        assertEquals(33, underTest.init(5, 7))
    }

    @Test
    fun testInitWithTwoNegativeNumber() {
        assertEquals(25, underTest.init(-5, -5))
    }

    @Test
    fun testInitWithOneNegativeNumberAndOnePositive() {
        assertEquals(-23, underTest.init(5, -7))
    }
}
