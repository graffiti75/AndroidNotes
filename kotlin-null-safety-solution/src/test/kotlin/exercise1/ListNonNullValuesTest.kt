package exercise1

import listWithNonNullValues
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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
internal class ListNonNullValuesTest {

    private lateinit var list: List<String?>
    private lateinit var res: List<String?>

    @Before
    fun setup() {
        list = listOf("a", null, "b")
        res = listWithNonNullValues(list)
    }

    @Test
    fun listWithNonNullValues_containsListSizeEqualTo2() {
        assertEquals(res.size, 2)
    }

    @Test
    fun listWithNonNullValues_returnsListContainingCharacterA() {
        assertTrue {
            res.contains("a")
        }
    }

    @Test
    fun listWithNonNullValues_returnsListContainingCharacterB() {
        assertTrue {
            res.contains("b")
        }
    }
}