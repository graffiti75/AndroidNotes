/**
## Exercise 1. Fibonacci (Iterative Solution)

- Implement a function `fib` that implements the Fibonacci Number
- The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1
                          0  1  2  3  4  5  6   7   8   9  10
- The Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 …
- Written as a rule, the expression is: `Xn = Xn-1 + Xn-2`
- Write a Unit Test for `fib`
 */

fun fib(n: Int): Int {
    var first = 0
    var second = 1

    if (n <= 1)
        return n
    for (i in 2..n) {
        val tmp = first + second
        first = second
        second = tmp
    }
    return second
}

fun main() {
    println(fib(0))
    println(fib(2))
    println(fib(4))
    println(fib(6))
    println(fib(8))
}