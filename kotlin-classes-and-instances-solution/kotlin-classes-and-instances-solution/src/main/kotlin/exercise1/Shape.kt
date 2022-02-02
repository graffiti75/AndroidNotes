package exercise1

interface Shape {
    fun getArea(): Double
}

class Rectangle(val length: Double, val height: Double): Shape {
    override fun getArea(): Double = length * height
}

class Circle(val radius: Double) : Shape {
    override fun getArea(): Double = radius * radius * Math.PI
}

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area: Double = 0.toDouble()
        for (shape in shapes) {
            area += shape.getArea()
        }
        return area
    }
}

fun main() {
    val r = Rectangle(2.0, 2.0)
    val c = Circle(3.0)
    val a = AreaFactory()
    val area = a.calculateArea(arrayListOf(r, c))
    println(area)
}