
# Create a function, block body, expression body, lambda functions and extension functions

# Topics
- Creating a function
- Block Body
- Expression Body
- Lambda Function
- Extension function

## Basic Requirements

Complete exercises below.

## Exercise 1. Creating a function, Block body and Expression body

- Which of the functions below has a correct definition?
- How do we call the function body definition of `sumOne`?
- How do we call the function body definition of `sumTwo`?

```
fun sumOne(a: Int, b: Int): Int {
  return a + b;
}

fun sumTwo(a: Int, b: Int) = a + b

fun sumThree(a: Int, b: Int) {
  return a + b;
}

fun sumFour(a, b) = a + b;
```

## Exercise 2. Lambda function

- Which of the lambda functions below compiles?
- What is the output for the ones that compiles?

```
val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = { str: String -> str.uppercase() }
val upperCase4: (String) -> String = { it.uppercase() }
val upperCase5: (String) = String::uppercase
```

## Exercise 3. Extension function

- Create an extension function `getLength` for the class below, that returns the concatenation between `firstName`, 1 space and `lastName`
- Try to implement it in just 1 line of code
- Call it in function `main`
- Implement a Unit Test for this example

```
class Person(val firstName: String, val lastName: String)
```

## Resources

- [Creating a function](https://kotlinlang.org/docs/functions.html)
- [Block Body vs Expression Body](https://stackoverflow.com/questions/55056330/why-is-it-called-expression-body-in-kotlin-fun-maxa-int-b-int-int-if/55056369)
- [Lambda Function](https://www.baeldung.com/kotlin/lambda-expressions)
- [Inline function](https://www.javatpoint.com/kotlin-inline-function)
- [Extension function](https://kotlinlang.org/docs/extensions.html)
