package exercise3

class Person(val firstName: String, val lastName: String)

fun main() {
    val p1 = Person("Marie", "Curie")
    println(p1.getLength())
}

fun Person.getLength() = "${this.firstName} ${this.lastName}".length