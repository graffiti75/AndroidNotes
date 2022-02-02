/**
Exercise 2. Print array elements except the First N or the Last N

- Write two lines of code in function `main`:
- The first line prints a list of elements in the array **except** the **first N elements**
- The second line prints a list of elements in the array **except** the **last N elements**
*/

fun main() {
    val n = 5
    val arr = arrayOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)

    println("After drop with $n value: " + arr.drop(n))
    println("After dropLast with $n value: " + arr.dropLast(n))
}