
# App Architecture (Persistence)

# Topics
- Different persisting data techniques, in memory, cache
- MVVM & LiveData
- Introduction to SOLID Principal and Clean Architecture

## Basic Requirements

Complete exercises below

## Exercise 1. MVVM & LiveData, In Memory Data Persistance

- Create an app that store the current datetime (in format "yyyy-MM-dd HH:mm:ss") when a `Button` is clicked
	- Each time you click into the `Button` a new datetime is added to a `TextView` (below the `Button`)
	- You will need to implement a Extension Function here to format each datetime
	- Take a look [here](https://stackoverflow.com/questions/56678746/kotlin-simpledateformat-parsing-takes-infinite-time) to learn more about the `SimpleDateFormat`
- This app must use `LiveData`, `ViewModel` and `DataBinding`
- The content of this `TextView` must be preserved when the phone is rotated
	- How can we do that using `ViewModel`?
- You must create a class `DataSource` to store, in the memory of the app, each datetime instance
	- Maybe you will need a `ViewModelFactory` to implement this step
	- When there's no data into the `DataSource` the `Button` must be disabled
		- You will need to implement this inside the XML using `DataBinding`
- This app must have a `Fragment` inside the `MainActivity.kt` 

## Exercise 2. SOLID Principles (Single Responsibility Principle)

- Take a look at the `User` class below, which holds the information about the `User` along with sign-in and sign-out methods for the user to manage the authentication process:

```
data class User(var id: Long, var name: String, var password: String) {
    fun signIn() {
        // This method will do signing in operations
    }

    fun signOut() {
        // This method will do signing out operations
    }
}
```

- Now let's assume that we need to make some changes for the authentication process in sign-in and sign-out methods
- Our user class will get affected because we added more than one responsibility to one class
- When such scenarios occur we should separate our classes
- This means the `User` class should only have one responsibility: to hold user information
- To solve the issue we should create a new class to manage the authentication process and move the sign-in and sign-out function in that class
- Implement this `AuthenticationService` class, respecting the **Single Responsibility Principle**

## Exercise 3. SOLID Principles (Open-Closed Principle)

- The code below has a class named area factory which calculates the area of a shape
- Having a close look at the code we see that we have an if-else statement to separate out the shapes, and as the shapes increase they will continue to grow that way because the class is not closed for modification, and neither it is open for extension
- Hence it is violating our open-closed principle.

```
class Rectangle(var length: Double, var height: Double)
class Circle(var radius: Double)

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        for (shape in shapes) {
            area += when (shape) {
                is Rectangle -> {
                    shape.length * shape.height
                }
                is Circle -> {
                    shape.radius * shape.radius * Math.PI
                }
                else -> {
                    throw RuntimeException("Shape not supported")
                }
            }
        }
        return area
    }
}
```

- With the help of an `interface`, fix this class, this time making the code respect the **Open-Closed Principle**

```
interface Shape {
    fun getArea(): Double
}

class Rectangle(val length: Double, val height: Double): Shape {
    override fun getArea() = length * height
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
```

## Resources

- [Different persisting data techniques, in memory, cache](https://developer.android.com/training/data-storage)
- [MVVM & LiveData](https://developer.android.com/jetpack/guide)
- [Introduction to SOLID Principal and Clean Architecture](https://medium.com/the-android-caf%C3%A9/solid-principles-the-kotlin-way-ff717c0d60da)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
