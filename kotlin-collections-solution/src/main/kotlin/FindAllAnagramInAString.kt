/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * Example 1:
 *
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

class FindAllAnagramInAString {

    fun findAnagrams(s: String, p: String): List<Int> {
        var sL = s.length
        var pL = p.length
        var result = mutableListOf<Int>()

        if(sL < pL) return emptyList<Int>()
        var i = 0

        while(i < sL && i + pL - 1 < sL) {
            if(isAnagram(p, s.substring(i, i + pL))) result.add(i)
            i++
        }
        return result
    }


    private fun isAnagram(s: String, p: String) : Boolean {
        var aph = IntArray(26)

        p.forEach {
            aph[it - 'a']++
        }

        s.forEach {
            aph[it - 'a']--
        }

        p.forEach {
            if(aph[it - 'a'] != 0) return false
        }
        return true
    }
}