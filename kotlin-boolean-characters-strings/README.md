
# Boolean, Character and Strings

# Topics
- Boolean
- Character
- Strings

## Basic Requirements

Complete exercises below.

## Exercise 1. Boolean

- What is the output for each statement below?

```
val a = (10 > 9)
val b = (10 = 9)
val c = (10 == 9)
val d = ((10 > 5) && (5 < 1)).not()
val e = a && c
```

## Exercise 2. Boolean

- Write a function that detects if a year is Leap.
- Write also a Unit Test

```
fun isLeapYear(year: Int): Boolean {
  return false; // TODO Update here
}
```

## Exercise 3. Characters

- Write a function to count the number of occurrences of a `character` like `'a'` inside a string `text`
- Write also a Unit Test

```
fun countOccurrences(text: String, character: Char = 'a'): Int {
  return -1; // TODO Update here
} 
```

## Exercise 4. Strings

- Now can we initialize a string with multiple lines?
- How can we remove blank space characters from a string, from its beginning and its end?
- How can we compare 2 strings in Kotlin?

## Exercise 5. Strings

- Write a function `findAndReplace` that:
  - Find a `key` string inside the text " Ana and Morgana likes to eat 4 bananas each 3 hours   " (in this case its default value will be "ana")
  - To make it easy for you, before making the research, turn everything in uppercase strings (both the text and the key)
  - If you didn't find, return -1
  - Remove all blank spaces from this text
  - Replace this `key` by the string "apple"
  - Print this new string
  - Count the number of **digits** into the new string and return this number
- Write also a Unit Test

```
private val TEXT = " Ana and Morgana likes to eat 4 bananas each 3 hours "

fun findAndReplace(text: String = TEXT, key: String = "ana"): Int {
  val text = " Ana and Morgana likes to eat banana   "
}
```

## Resources

- [Boolean](https://www.w3schools.com/kotlin/kotlin_booleans.php)
- [Character](https://tutorialwing.com/kotlin-character-tutorial-example/)
- [Strings](https://www.w3schools.com/kotlin/kotlin_strings.php)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
