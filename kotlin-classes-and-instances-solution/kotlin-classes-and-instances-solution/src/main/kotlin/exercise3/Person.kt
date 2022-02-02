package exercise3

data class Person(val firstName: String, val lastName: String, val age: Int)
class Machine(val name: String, val dateOfConstruction: String)

fun main() {
    val p1 = Person("Marie", "Curie", 30)
    val p2 = Person("Marie", "Curie", 30)
    println(p1 == p2)
    println(p1)

    val m1 = Machine("HAL", "1968/04/03")
    val m2 = Machine("HAL", "1968/04/03")
    println(m1 == m2)
    println(m1)
}