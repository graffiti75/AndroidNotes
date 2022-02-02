/**
## Exercise 2. Fibonacci (Recursive Solution)

- Implement a function `fibRec` that implements the Fibonacci Number in a recursive way
- Write a Unit Test for `fibRec`
 */

fun fibRec(n: Int): Int = if (n <= 2) 1 else fibRec(n - 1) + fibRec(n - 2)

fun main() {
    println(fibRec(0))
    println(fibRec(2))
    println(fibRec(4))
    println(fibRec(6))
    println(fibRec(8))
}