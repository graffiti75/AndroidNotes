import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RomanNumbersTest {

    private val underTest : RomanNumbers = RomanNumbers()

    @Test
    fun testConvert3() {
        val result = underTest.romanToInt("III")
        assertEquals(3, result)
    }

    @Test
    fun testConvert4() {
        val result = underTest.romanToInt("IV")
        assertEquals(4, result)
    }

    @Test
    fun testConvert9() {
        val result = underTest.romanToInt("IX")
        assertEquals(9, result)
    }

    @Test
    fun testConvert58() {
        val result = underTest.romanToInt("LVIII")
        assertEquals(58, result)
    }

    @Test
    fun testConvert1994() {
        val result = underTest.romanToInt("MCMXCIV")
        assertEquals(1994, result)
    }
}