package exercise4

class Vehicle {
    var brand: String = "Unknown"

    fun info() = println(brand)

    inner class SteeringWheel {
        var name = "Leather"
        fun info() = println("$brand is the brand of vehicle with a $name steering wheel")
    }

    inner class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }

    class OtherTransmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}

fun main() {
    val myCar = Vehicle()
    myCar.brand = "Fiat"
    myCar.info()

    val sw = myCar.SteeringWheel()
    sw.info()

    val other = Vehicle.OtherTransmission()
    other.shift()
}