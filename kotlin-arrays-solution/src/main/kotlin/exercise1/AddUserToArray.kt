/**
Exercise 1. Add a User to an Array

- Given the class `User` below:
    - Write a function `addUser` that adds a user to the end of a given `Array`
- Write also a Unit Test
*/

class User(val firstName: String, val lastName: String) {
    override fun toString(): String {
        return "User[firstName: $firstName, lastName: $lastName]"
    }
}

fun addUser(arr: Array<User>, newElement: User): Array<User> {
    return arr.plus(newElement)
}

fun main() {
    val users = arrayOf(
        User("Marie", "Curie"),
        User("Janis", "Joplin")
    )
    users.forEach {
        println(it)
    }

    println()

    val newUsers = addUser(users, User("Angela", "Merkel"))
    newUsers.forEach {
        println(it)
    }
}