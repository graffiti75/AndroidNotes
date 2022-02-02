/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Example 3:
 * Input: s1 = "", s2 = ""
 * Output: true
 */

class PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var i = s1.lastIndex
        var j = s2.lastIndex
        var s = 0
        if(j < i) return false
        while(s + i <= j) {
            if(containsAPermutation(s2.substring(s, s + i + 1), s1)) return true
            s++
        }
        return false
    }

    private fun containsAPermutation(s1: String, s2: String) : Boolean {

        var alphabet = IntArray(26)

        s1.forEach {
            alphabet[it - 'a']++
        }

        s2.forEach {
            alphabet[it - 'a']--
        }

        return alphabet.none { it != 0 }
    }
}