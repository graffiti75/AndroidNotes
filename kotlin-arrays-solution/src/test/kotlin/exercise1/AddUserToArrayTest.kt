package exercise1

import User
import addUser
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class AddUserToArrayTest {

    private lateinit var users: Array<User>
    private lateinit var newUsers: Array<User>
    private lateinit var userToAdd: User

    @Before
    fun setup() {
        users = arrayOf(
            User("Marie", "Curie"),
            User("Janis", "Joplin")
        )
        userToAdd = User("Angela", "Merkel")
        newUsers = addUser(users, userToAdd)
    }

    @Test
    fun addUserAppendedUserCorrectly() {
        val newUsersSize = newUsers.size
        assertEquals(newUsers[newUsersSize - 1], userToAdd)
    }

    @Test
    fun addUserIncreasedArraySize() {
        val userSize = users.size
        val newUsersSize = newUsers.size
        assertEquals(userSize + 1, newUsersSize)
    }
}