package exercise3

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class PersonTest {

    lateinit var p1: Person

    @Before
    fun setup() {
        p1 = Person("Marie", "Curie")
    }

    @Test
    fun checkFullNameLength() {
        assertEquals(p1.getLength(), 11)
    }
}