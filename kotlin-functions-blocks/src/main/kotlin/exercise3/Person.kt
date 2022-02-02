package exercise3

class Person(val firstName: String, val lastName: String)

fun main() {
    val p1 = Person("", "")
    println(p1.getLength())
}

fun Person.getLength() = "TODO"