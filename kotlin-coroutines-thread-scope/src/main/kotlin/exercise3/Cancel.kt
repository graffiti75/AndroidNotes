import kotlinx.coroutines.*

/**
## Exercise 3: Challenge

- The code below may take too much time to run, and maybe can cause a `OutOfMemoryException`
- How can we prevent this to happen? How can we stop the Coroutine below?
 */
fun main() = runBlocking {
    val job = GlobalScope.launch(Dispatchers.Default) {
        println("Starting long running calculation...")
        for (i in 0..80) {
            if (isActive) {
                println("Result for i = $i: ${fib(i)}")
            }
        }
        println("Ending long running calculation...")
    }

    job.join()
}

fun fib(n: Int): Long {
    return if (n == 0) 0
    else if (n == 1) 1
    else if (n == 2) 1
    else fib(n - 1) + fib(n - 2)
}