
# Coroutines, thread & Scope

# Topics
- Coroutines, thread & Scope

## Basic Requirements

Complete exercises below, and Unit Tests (when required)

## Exercise 1. Run Blocking

- Given the code below, what is the correct output?
  - A.
    ```
    1
    5
    3
    2
    4
    ```
  - B.
    ```
    1
    2
    5
    3
    4
    ```
  - C.
    ```
    1
    5
    2
    4
    3    
    ```
  - D.
    ```
    1
    2
    3
    4
    5
    ```

  ```
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
  ```

### Solution

- The correct output is the item `A`

## Exercise 2. Async & Await

- Given the code below, what is the correct output?
  - A.
    ```
    Awaiting computations...
    The result is 140
    Computation1 finished
    Computation2 finished
    ```
  - B.
    ```
    Computation1 finished
    Computation2 finished
    Awaiting computations...
    The result is 140
    ```
  - C.
    ```
    Awaiting computations...
    Computation1 finished
    The result is 140
    Computation2 finished
    ```
  - D.
    ```
    Awaiting computations...
    Computation1 finished
    Computation2 finished
    The result is 140
    ```

  ```
  import kotlinx.coroutines.*
  import java.text.SimpleDateFormat
  import java.util.*

  fun main() = runBlocking {
      val deferred1 = async { computation1() }
      val deferred2 = async { computation2() }
      printCurrentTime("Awaiting computations...")
      val result = deferred1.await() + deferred2.await()
      printCurrentTime("The result is $result")
  }

  suspend fun computation1(): Int {
      delay(1000L) // simulated computation
      printCurrentTime("Computation1 finished")
      return 131
  }

  suspend fun computation2(): Int {
      delay(2000L)
      printCurrentTime("Computation2 finished")
      return 9
  }

  fun printCurrentTime(message: String) {
      val time = (SimpleDateFormat("hh:mm:ss")).format(Date())
      println("[$time] $message")
  }
  ```

### Solution

- The correct output is the item `D`

## Exercise 3: Challenge

- The code below may take too much time to run, and maybe can cause a `OutOfMemoryException`
- How can we prevent this to happen? How can we stop the Coroutine below?
  ```
  fun main() = runBlocking {
      val job = GlobalScope.launch(Dispatchers.Default) {
          println("Starting long running calculation...")
          for (i in 30..80) {
              println("Result for i = $i: ${fib(i)}")
          }
          println("Ending long running calculation...")
      }

      runBlocking {
          job.join()
      }
  }

  fun fib(n: Int): Long {
      return if (n == 0) 0
      else if (n == 1) 1
      else if (n == 2) 1
      else fib(n - 1) + fib(n - 2)
  }
  ```
  
### Solution

- Check the source code

## Resources

- [Coroutines](https://kotlinlang.org/docs/coroutines-basics.html)
- [Scopes](https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html)
