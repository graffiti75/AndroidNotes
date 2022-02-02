
# Exception handling

# Topics
- Exception handling

## Basic Requirements

Complete exercises below, and Unit Tests (when required)

## Exercise 1. Throw

- Create a function `invalidAge` that throw an `IllegalArgumentException` when the age of a `Person` is below 18

```
data class Person(val name: String, val age: Int)

fun invalidAge(p: Person) {
  // TODO
}
```

## Exercise 2. Custom Exception

- Create a custom `Exception` called `InvalidAgeException` that:
  - Has parameters `age: Int` and `message: String`
  - Throws an `IllegalArgumentException` with a message `"Invalid age: $age. $message"`
- Modify function `invalidAge` to throw `InvalidAgeException`
- Call this function `invalidAgeCustomException`

## Exercise 3. Unit Test

- Write a Unit Test for `invalidAgeCustomException`
- This Unit Test is different because it must check if the function is throwing an `InvalidAgeException`

## Resources

- [Exception handling](https://www.baeldung.com/kotlin/exception-handling)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
