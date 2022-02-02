package exercise3

import InvalidAgeException
import Person
import invalidAgeCustomException
import org.junit.Before
import org.junit.Test
import kotlin.test.assertFailsWith

/**
## Exercise 3. Unit Test

- Write a Unit Test for `invalidAgeException`
- This Unit Test is different because it must check if the function is throwing an `InvalidAgeException`
 */
internal class ThrowTest {

    private lateinit var p: Person

    @Before
    fun setup() {
        p = Person("Marie", 13)
    }

    @Test
    fun givenInvalidAge_thenThrowsException() {
        assertFailsWith(
            exceptionClass = InvalidAgeException::class,
            message = "No exception found",
            block = { invalidAgeCustomException(p) }
        )
    }
}