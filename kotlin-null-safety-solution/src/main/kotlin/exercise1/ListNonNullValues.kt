/**
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
 */

fun listWithNonNullValues(list: List<String?>): List<String?> {
    return list.filterNotNull()
}

fun main() {
    val list: List<String?> = listOf("a", null, "b")
    val res = listWithNonNullValues(list)
    res.forEach {
        println(it)
    }
}