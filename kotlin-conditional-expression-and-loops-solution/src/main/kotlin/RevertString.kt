/******
 *
 * Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */

class RevertString {
    fun reverseString(s: CharArray): Unit {
        if(s.isNotEmpty())
            reverse(s, 0, s.lastIndex)
    }

    private fun reverse(s: CharArray, start : Int, end : Int) : Char {
        return if(start >= end) { s[start] }
        else {
            var t = s
            var temp = t[end]
            t[end] = t[start]
            t[start] = temp

            return reverse(t, start + 1, end - 1)
        }
    }
}