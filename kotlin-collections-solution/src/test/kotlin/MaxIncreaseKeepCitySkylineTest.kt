import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MaxIncreaseKeepCitySkylineTest {

    private val underTest =  MaxIncreaseKeepCitySkyline()

    @Test
    fun testTheHighestIs35() {
        val skyline = arrayOf(
            intArrayOf(3,0,8,4),
            intArrayOf(2,4,5,7),
            intArrayOf(9,2,6,3),
            intArrayOf(0,3,1,0)
        )
        val result = underTest.maxIncreaseKeepingSkyline(skyline)
        assertEquals(35, result)
    }

    @Test
    fun testTheHighestIs0() {
        val skyline = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,0,0,0),
            intArrayOf(0,0,0,0),
            intArrayOf(0,0,0,0),
        )
        val result = underTest.maxIncreaseKeepingSkyline(skyline)
        assertEquals(0, result)
    }
}