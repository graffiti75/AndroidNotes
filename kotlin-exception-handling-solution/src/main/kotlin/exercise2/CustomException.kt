/**
## Exercise 2. Custom Exception

- Create a custom `Exception` called `InvalidAgeException` that:
    - Has parameters `age: Int` and `message: String`
    - Throws an `IllegalArgumentException` with a message `"Invalid age: $age. $message"`
- Modify function `invalidAge` to throw `InvalidAgeException`
- Call this function `invalidAgeCustomException`
 */

class InvalidAgeException(val age: Int, message: String): IllegalArgumentException("Invalid age: $age. $message")

fun invalidAgeCustomException(p: Person) {
    if (p.age < 18) {
        throw InvalidAgeException(p.age, "User is not old enough.")
    }
}

fun main() {
    val p = Person("Marie", 13)
    invalidAgeCustomException(p)
}