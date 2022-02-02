/**
## Exercise 1. Throw

- Create a function `invalidAge` that throw an `IllegalArgumentException` when the age of a `Person` is below 18
 */

data class Person(val name: String, val age: Int)

fun invalidAge(p: Person) {
    if (p.age < 18) {
        throw IllegalArgumentException("User is not old enough.")
    }
}

fun main() {
    val p = Person("Marie", 13)
    invalidAge(p)
}