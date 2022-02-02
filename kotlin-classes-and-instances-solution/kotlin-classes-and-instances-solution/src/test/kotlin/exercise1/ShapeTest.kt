package exercise1

import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class ShapeTest {

    lateinit var r: Rectangle
    lateinit var c: Circle
    lateinit var a: AreaFactory

    @Before
    fun setup() {
        r = Rectangle(2.0, 2.0)
        c = Circle(3.0)
        a = AreaFactory()
    }

    @Test
    fun areaIs32_withDeltaOf1() {
        val area = a.calculateArea(arrayListOf(r, c))
        assertEquals(area, 32.0, 1.0)
    }
}