
# Arrays

# Topics
- Arrays

## Basic Requirements

Complete exercises below, and Unit Tests (when required)

## Exercise 1. Add a User to an Array

- Given the class `User` below:
  - Write a function `addUser` that adds a user to the end of a given `Array`
- Write also Unit Tests:
  - `addUserAppendedUserCorrectly`, that checks if the last element in the array is the added element
  - `addUserIncreasedArraySize`, that checks if the new array size is bigger 1 element than the previous array

```
class User(firstName: String, lastName: String)

fun addUser(arr: Array<User>, newElement: User): Array<User> {
  // TODO
}
```

### Solution
- Check the source code

## Exercise 2. Print array elements except the First N or the Last N

- Write two lines of code in function `main`:
  - The first line prints a list of elements in the array **except** the **first N elements**
  - The second line prints a list of elements in the array **except** the **last N elements**

### Solution
- Check the source code

## Exercise 3. Concatenate two arrays in Kotlin

- Write a function `concatenateArrays` that combine two `IntArray`'s and return its concatenation
- Write a Unit Test for `concatenateArrays`
- As a challenge, try to implement a generic function called `concatenateAnyArray`, that combine two arrays `Array<T>` and return its concatenation

```
fun concatenateArrays(a: IntArray, b: IntArray): IntArray {
  // TODO
}
```

### Solution
- Check the source code

## Exercise 4. Combine two arrays of different types in Kotlin

This exercise is a **challenge**:

- Write a function `combineArrays` that combine two arrays of different types and return its concatenation
- Write a Unit Test for `combineArrays`

### Solution
- Check the source code

## Exercise 5. Copy arrays in Kotlin

- Write a function `copyArrays` that copy the content of one array to another, and return this another array
- Write a Unit Test for `copyArrays`

### Solution
- Check the source code

## Exercise 6. Check for duplicates in an array in Kotlin

- Write a function `hasDuplicates` that check if one array has a duplicated item (this function returns a boolean)
- Write a Unit Test for `hasDuplicates`

```
fun <T> hasDuplicates(arr: Array<T>): Boolean {
  // TODO
}
```

### Solution
- Check the source code

## Resources

- [Arrays](https://www.w3schools.com/kotlin/kotlin_arrays.php)
