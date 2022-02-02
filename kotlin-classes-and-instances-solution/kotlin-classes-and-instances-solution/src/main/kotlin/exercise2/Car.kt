package exercise2

abstract class Car(var color: String, val numberOfWheels: Int, val numberOfDoors: Int) {
    abstract fun drive()
    companion object {
        fun showColor(car: Car) = print (car.color)
    }
}

abstract class TwoDoorCar(color: String, numberOfWheels: Int): Car(color, numberOfWheels, numberOfDoors = 2) {
    abstract fun driveFast()
    override fun drive() = println("Driving")
}

class Lambo : TwoDoorCar("yellow", 4) {
    override fun driveFast() = println("Driving fast the Lambo")
}

class Ferrari : TwoDoorCar("red", 4) {
    override fun driveFast() = println("Driving fast the Ferrari")
}

fun main() {
    val lambo = Lambo()
    val ferrari = Ferrari()

    lambo.drive()
    lambo.driveFast()

    ferrari.drive()
    ferrari.driveFast()

    Car.showColor(lambo)
}