package exercise6

sealed class Color {
    object RED : Color()
    object ORANGE : Color()
    object BLUE : Color()
}

fun eval(c: Color) = when (c) {
    is Color.RED -> println("Color is Red color")
    is Color.ORANGE -> println("Color is Orange color")
    is Color.BLUE -> println("Color is Blue color")
}

fun main() {
    val r = Color.RED
    eval(r)
}