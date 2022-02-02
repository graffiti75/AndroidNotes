/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 * Example 1:
 * Input: s = "III"
 * Output: 3
 *
 * Example 2:
 * Input: s = "IV"
 * Output: 4
 *
 * Example 3:
 * Input: s = "IX"
 * Output: 9
 *
 * Example 4:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 *
 * Example 5:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
class RomanNumbers {
    var map1 = hashMapOf("IV" to 4,  "IX" to 9, "XL" to 40, "XC" to 90, "CD" to 400, "CM" to 900)

    var map2 = hashMapOf("I" to 1,  "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)

    fun romanToInt(s: String): Int {
        var input = s.toCharArray()
        var count = 0

        for(i in 0..s.lastIndex) {
            var c = s[i].toString()
            if(i > 0) {
                var s1 = input[i - 1].toString()
                var s2 = input[i].toString()
                var r = s1 + s2
                if(map1.contains(r)) {
                    (count - map2.get(s1)!! + map1.get(r)!!).also { count = it }
                } else {
                    count += map2.get(s2)!!
                }
            } else {
                count += map2.get(c)!!
            }

        }

        return count
    }
}