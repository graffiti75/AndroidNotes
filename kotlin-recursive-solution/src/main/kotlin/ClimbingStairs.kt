/****
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var memo = IntArray(n)
        return climbing(0, n, memo)
    }

    private fun climbing(i: Int, n: Int, memo: IntArray): Int {
        if (i > n) {
            return 0
        }
        if (i == n) {
            return 1
        }
        if (memo[i] > 0) {
            return memo[i]
        }
        memo[i] = climbing(i + 1, n, memo) + climbing(i + 2, n, memo)
        return memo[i]
    }
}