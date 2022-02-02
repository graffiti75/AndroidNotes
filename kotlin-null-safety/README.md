
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

## Exercise 2. Return a default value when reference holds a null

- Given the code below, how can we simply set a value for a variable `length` (for instance, the value -1) if `text` value is null?

```
val text: String? = "name"
val length = TODO
```

## Exercise 3. Scoped functions

- What are Scoped Functions?
- What is the difference between them all?

## Exercise 4. ? and !! 

- What is the difference between operators ? and !! in Kotlin?

## Resources

- [Null safety](https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety)
- [Scoped functions](https://kotlinlang.org/docs/scope-functions.html)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
