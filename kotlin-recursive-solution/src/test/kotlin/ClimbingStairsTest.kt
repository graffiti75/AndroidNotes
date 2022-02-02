import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ClimbingStairsTest {

    private val underTest = ClimbingStairs()

    @Test
    fun testClimbingStairs2() {
        assertEquals(2, underTest.climbStairs(2))
    }

    @Test
    fun testClimbingStairs3() {
        assertEquals(3, underTest.climbStairs(3))
    }

    @Test
    fun testClimbingStairs14() {
        assertEquals(610, underTest.climbStairs(14))
    }
}