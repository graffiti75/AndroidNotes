package exercise2

object Lamp {
    var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn) {
            println("Lamp is on")
        } else {
            println("Lamp is off")
        }
    }
}

fun main() {
    Lamp.displayLightStatus()
    Lamp.turnOn()
    Lamp.displayLightStatus()
    Lamp.turnOff()
    Lamp.displayLightStatus()
}