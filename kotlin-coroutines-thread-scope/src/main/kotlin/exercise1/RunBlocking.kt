import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(1000L)
        GlobalScope.launch {
            println("1")
        }
        delay(1000L)
        doSomething()
        launch {
            delay(1000L)
            println("2")
        }
        println("3")
        delay(5000L)
    }
    println("4")
}

suspend fun doSomething() {
    println("5")
    delay(1000L)
}