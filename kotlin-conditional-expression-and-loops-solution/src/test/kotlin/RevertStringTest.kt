import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals


internal class RevertStringTest {

    private val underTest : RevertString = RevertString()

    @Test
    fun revertHelloString() {
        val test = "hello".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("olleh".toCharArray(), test)
    }

    @Test
    fun revertHannahString() {
        val test = "Hannah".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("hannaH".toCharArray(), test)
    }

    @Test
    fun revertEmptyString() {
        val test = "".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("".toCharArray(), test)
    }

    @Test
    fun revertAStringWithASpace() {
        val test = "I think today is a very nice day".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("yad ecin yrev a si yadot kniht I".toCharArray(), test)
    }

    @Test
    fun revertAStringWithASpecialCarachter() {
        val test = "'Hi!' said Sara".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("araS dias '!iH'".toCharArray(), test)
    }

    @Test
    fun revertANullString() {
        val test = """ee""".toCharArray()
        underTest.reverseString(test)
        assertContentEquals("""ee""".toCharArray(), test)
    }
}