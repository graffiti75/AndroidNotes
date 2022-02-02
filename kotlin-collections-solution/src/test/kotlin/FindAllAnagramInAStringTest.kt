import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class FindAllAnagramInAStringTest {

    private val underTest: FindAllAnagramInAString = FindAllAnagramInAString()

    @Test
    fun testFindAnagram1() {
        val result = underTest.findAnagrams("cbaebabacd", "abc")
        assertContentEquals(listOf(0,6), result)
    }

    @Test
    fun testFindAnagram2() {
        val result = underTest.findAnagrams("abab", "ab")
        assertContentEquals(listOf(0,1,2), result)
    }

    @Test
    fun testNoAnagram() {
        val result = underTest.findAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbb")
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun testNoAnagram2() {
        val result = underTest.findAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaab", "bbbbbbbbb")
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun testNoAnagram3() {
        val result = underTest.findAnagrams("abc", "abcc")
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun testFindAnagram3() {
        val result = underTest.findAnagrams("omaraaramo", "omar")
        assertContentEquals(listOf(0,6), result)
    }

    @Test
    fun testFindAnagram4() {
        val result = underTest.findAnagrams("abababa", "aba")
        assertContentEquals(listOf(0,2,4), result)
    }

    @Test
    fun testFindAnagram5() {
        val result = underTest.findAnagrams("abbabab", "ab")
        assertContentEquals(listOf(0,2,3,4,5), result)
    }
}