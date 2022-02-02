package exercise3

class Rectangle(var length: Double, var height: Double)
class Circle(var radius: Double)

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        for (shape in shapes) {
            area += when (shape) {
                is Rectangle -> {
                    shape.length * shape.height
                }
                is Circle -> {
                    shape.radius * shape.radius * Math.PI
                }
                else -> {
                    throw RuntimeException("Shape not supported")
                }
            }
        }
        return area
    }
}

fun main() {
    val rectangle = Rectangle(2.0, 2.0)
    val circle = Circle(2.0)
    val area = AreaFactory()
    println(
        area.calculateArea(
            arrayListOf(rectangle, circle)
        )
    )
}