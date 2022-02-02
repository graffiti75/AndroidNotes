package exercise3

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class PersonTest {

    lateinit var p1: Person
    lateinit var p2: Person

    lateinit var m1: Machine
    lateinit var m2: Machine

    @Before
    fun setup() {
        p1 = Person("Marie", "Curie", 30)
        p2 = Person("Marie", "Curie", 30)

        m1 = Machine("HAL", "1968/04/03")
        m2 = Machine("HAL", "1968/04/03")
    }

    @Test
    fun checkDataClass_equals() {
        assertEquals(p1, p2)
    }

    @Test
    fun checkNormalClass_notEquals() {
        assertNotEquals(m1, m2)
    }
}