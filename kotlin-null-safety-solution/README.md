
# Null safety

# Topics
- Null safety in Kotlin
- Scoped functions

## Basic Requirements

Complete exercises below, and Unit Tests (when required)

## Exercise 1. List for Non Null values

- Given the list below, how can we filter it to get only non-null values?

```
val list: List<String?> = listOf("a", null, "b")
```

- Create a function `listWithNonNullValues` that returns a list with non-null values
- Create 3 Unit Tests:
  - `listWithNonNullValues_containsListSizeEqualTo2`
  - `listWithNonNullValues_returnsListContainingCharacterA`
  - `listWithNonNullValues_returnsListContainingCharacterB`

### Solution

- Check the source code

## Exercise 2. Return a default value when reference holds a null

- Given the code below, how can we simply set a value for a variable `length` (for instance, the value -1) if `text` value is null?

```
val text: String? = "name"
val length = TODO
```
### Solution

- We can use the code below:

```
val text: String? = "name"
var length: Int = text?.length ?: -1 // Elvis operator
```

## Exercise 3. Scoped functions

- What are Scoped Functions?
- What is the difference between them all?

### Solution

- What are Scoped Functions?
  - Are the functions `also`, `apply`, `let`, `run` and `with`
  - For more details you can check [this link](https://kotlinlang.org/docs/scope-functions.html)
- What is the difference between them all?
  - `also` vs `apply`
    - **also**
      ```
      // Calls the specified function [block] with `this` value as its argument and returns `this` value.
      @SinceKotlin("1.1") public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
      ```
    - **apply**
      ```
      // Calls the specified function [block] with `this` value as its receiver and returns `this` value
      `public inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this`
      ```
    - Their return value is always this, which is the receiver instance with type T
    - The block returns Unit in both functions
      ```
      StringBuilder().also {
          it.append("content: ")
          it.append(it.javaClass.canonicalName)
      }.print() // content: java.lang.StringBuilder

      StringBuilder().apply {
          append("content:")
          append(javaClass.canonicalName)
      }.print() // content: java.lang.StringBuilder
      ```
    - Both functions work exactly the same way, but with one subtle difference that in `also` we have to use an explicit it variable to append content
    - In `apply` we can directly call `append()` as if block was part of the instance
      - Why? Because block is defined as `(T) → Unit` but it is defined as `T.() → Unit` in `apply`
    - So you can simply see `apply` as a "simpler" version of `also` that it has an implicit this defined to be used in the function body
      - `also` requires you to use it, but it can be more readable in some cases, or you can even name the instance to fit your context better
  - `let` vs `run`
    - **let**
      ```
      // Calls the specified function [block] with `this` value as its argument and returns its result
      public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
      ```
    - **run**
      ```
      // Calls the specified function [block] with `this` value as its receiver and returns its result
      public inline fun <T, R> T.run(block: T.() -> R): R = block()
      ```
    - block is defined as `(T) → R` in `let`, but it is defined as `T.() → R` in run
    - Their return value is R from block function
      ```
      StringBuilder().let {
          it.append("content: ")
          it.append(it.javaClass.canonicalName)
      }.print()

      StringBuilder().run {
          append("content: ")
          append(javaClass.canonicalName)
      }.print()
      ```
    - `let` requires an explicit *it* and `run` has an implicit *this* in their block body
    - However, this pair of functions has another major difference than `also` and `apply`
      - They return the value returned by the block body
      - In other words, both let() and run() return whatever block returns
        ```
        StringBuilder().run {
            append("run (append):")
            append(" ")
            append(javaClass.canonicalName)
        }.print() // run (append): java.lang.StringBuilder

        StringBuilder().run {
            append("run (length):")
            append(" ")
            append(javaClass.canonicalName)
            length
        }.print() // 37
        ```
    - The first one returns the enclosing string builder since `append()` returns the string builder itself, but the second one returns 37 since `length()` returns an integer
      - So both `let` and `run` can be used when you want to operate an instance of `T` but you also want to have a different return value `R`
  - `with`
    ```
    // Calls the specified function [block] with the given [receiver] as its receiver and returns its result
    public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
    ```
    - For instance:
      ```
      with(StringBuilder()) {
          append("content: ")
          append(javaClass.canonicalName)
      }.print()
      ```
    - `with` is not an extension function on type `T`, but it takes an instance of `T` as the first argument
      - Also Kotlin allows us to move the last function argument out of the parenthesis
    - `block` is defined as `T.() -> R` so you don’t have to use it, and you can change the return value in block body

## Exercise 4. ? and !! 

- What is the difference between operators ? and !! in Kotlin?

### Solution

- As it said in [Kotlin reference](https://kotlinlang.org/docs/null-safety.html), `!!` is an option for `NullPointerException`-lovers
- `a!!.length` will return a non-null value of `a.length` or throw a [NullPointerException](https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it) if a is null:
  ```
  val a: String? = null
  print(a!!.length) // >>> NPE: trying to get length of null
  ```
- `a?.length` returns `a.length` if `a` is not null, and null otherwise:
  ```
  val a: String? = null
  print(a?.length) // >>> null is printed in the console
  ```
- To sum up:
  | a: String? | a.length           | a?.length | a!!.length           |
  |------------|--------------------|-----------|----------------------|
  | "cat"      | Compile time error | 3         | 3                    |
  | null       | Compile time error | null      | NullPointerException |

- For more details, please take a look [here](https://stackoverflow.com/questions/44536114/whats-the-difference-between-and-in-kotlin)

## Resources

- [Null safety](https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety)
- [Scoped functions](https://kotlinlang.org/docs/scope-functions.html)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
