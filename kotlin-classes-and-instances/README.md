
# Creating classes and instances

# Topics
- Classes in Kotlin
- Companion Object
- Difference between Object and Instance of a Class
- Data classes
- Sealed classes
- Nested classes
- Inner classes
- Enum classes
- Inline classes

## Basic Requirements

Complete exercises below, write the code and Unit Tests (for Exercises 1 and 3).

## Exercise 1. Class Shape

This example covers the OOP concept of Inheritance.

- Create an interface `Shape` that has a method called `getArea` that returns a `Double` value
- Create 2 classes that implements `Shape`: `Rectangle` and `Cirle`
- `Rectangle` must have 2 `Double` attributes: `length` and `height`
- `Circle` must have 1 `Double` attribute: `radius`
- Create a class called `AreaFactory` that has a method `calculateArea`:
	- This method should have a `ArrayList<Shape>` parameter `shapes` and must return a `Double`
- In function `main`:
	- Initialize 2 instances: 1 from `Rectangle` and 1 from `Circle`
	- Create an instance of `AreaFactory` and call method `calculateArea`
	- Print the value of this area

## Exercise 2. Class Car

This example covers the concept of Abstract Classes and Companion Object.

- Create an abstract class `Car` that has 3 attributes:
	- color: String
	- numberOfWheels: Int
	- numberOfDoors: Int
- This class must have 1 abstract method `drive`
- Create a child class from `Car`:
	- This class must be the abstract class `TwoDoorCar`
	- This class must have an abstract method `driveFast`
	- Also, **must implement** (because it is an Abstract Class) the method `drive`, printing "Driving" 
	**PS.: What should you do in the constructor of `TwoDoorCar` to make it have 2 doors?**
- Create 2 child classes from `TwoDoorCar`: `Lambo` and `Ferrari`
  - Those classes **must implement** (because it is an Abstract Class) the method `driveFast`, printing "Driving fast the Lambo/Ferrari"
- Create a `companion object` inside class `Car` calling method `showColor`, that has 1 parameter of type `Car`
- Finally, in function `main`:
  - Initialize 2 instances (1 from `Lambo` and 1 from `Ferrari`)
  - Call methods `drive` and `driveFast`
  - Call method `showColor` from variable `lambo`

## Exercise 3. Classes Person and Machine

This example covers the concept of Data Class.

- Create a data class `Person` with attributes:
  - firstName: String
  - lastName: String
  - age: Int
- Create a class `Machine` with attributes:
  - name: String
  - dateOfConstruction: String
- In function `main`:
  - Create 2 instances of `Person` (p1 and p2) with same values in each attribute
  - Check if the instances are the same
  - Print p1
  - Create 2 instances of `Machine` (m1 and m2) with same values in each attribute
  - Check if the instances are the same
  - Print m1

## Exercise 4. Class Vehicle

This example covers the concept of Inner Classes and Nested Classes.

- Create a class `Vehicle` with:
  - Attribute `brand`: String
  - Method `info`, that prints the `brand`
- Create 2 *inner classes* in `Vehicle`: `SteeringWheel` and `Transmission`:
  - Class `SteeringWheel` must have attribute `name` and method `info`, that prints the `brand` and the `name` in the following way:
    - `"$brand is the brand of vehicle with a $name steering wheel"`
  - Class `Transmission` must have attribute `type` and method `shift`, that prints "The vehicle has shifted"
- Create a *nested class* `OtherTransmission` with attribute `type` and method `shift`
- In function `main`:
  - Create variable `myCar` of type `Vehicle`
  - Set a `brand` for `myCar` and then call `info`
  - Create variable `steeringWheel` of type `SteeringWheel` and then call method `info`
  - Create variable `other` of type `OtherTransmission` and then call method `shift`

## Exercise 5. Class AccountType

This example covers the concept of Enum Classes.

- Create a enum class `AccountType` with attributes:
  - `discountPercent: Int`
  - `numberOfSubscriptions: Int`
- Create an abstract method for `AccountType` called `calculateSpecialDiscountPercent` that returns `Int`
- Set the enums for this class:
  - BRONZE, SILVER, GOLD, PLATINUM
  **PS.: Don't forget to implement the abstract class for each enum.**
- Create a `companion object` with a method called `getAccountTypeByName`:
  - This method has parameter `name: String`
  - This method returns a `valueOf` with parameter `name` in upper case string.
- In function `main`:
  - Print `AccountType.GOLD` and `AccountType.GOLD.discountPercent`
  - Create a variable `value` that receives the value of "Platinum" (in upper case)
  - Print `value`, `value.discountPercent` and `value.numberOfSubscriptions`
  - Also print the value returned by method `calculateSpecialDiscountPercent`
  - Finally, create a variable `accountType` that receives the value returned by method `getAccountTypeByName` (with parameter "gold")
  - Print `accountType`

## Exercise 6. Class Color

This example covers the concept of Sealed Classes.

- Create a sealed class `Color` that has 3 sealed classes: `Red`, `Orange` and `Blue`
- Create a method called `eval` that has a `Color` parameter and prints the output `"Color is $color color"`
- In function `main`:
  - Create a variable and set a color for it
  - Call `eval` for this variable

## Resources

- [Classes in Kotlin](https://www.javatpoint.com/kotlin-class-and-object)
- [Companion Objects in Kotlin](https://blog.mindorks.com/companion-object-in-kotlin)
- [Difference between Object and Instance of a Class](https://www.baeldung.com/kotlin/classes-vs-singleton-objects)
- [Data classes](https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body)
- [Sealed classes](https://medium.com/@kamilbekar/how-to-use-sealed-class-in-kotlin-f186c30a21e2)
- [Nested classes](https://kotlinlang.org/docs/nested-classes.html)
- [Inner classes](https://kotlinlang.org/docs/nested-classes.html)
- [Enum classes](https://www.baeldung.com/kotlin/enum)
- [Inline classes](https://www.baeldung.com/kotlin/inline-classes)
