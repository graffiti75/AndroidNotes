package exercise2

import org.junit.Test
import kotlin.test.assertEquals

internal class LampTest {

    @Test
    fun givenLampTurnedOnAndOff_thenReturnCurrentStatusAsOff() {
        Lamp.displayLightStatus()
        Lamp.turnOn()
        Lamp.displayLightStatus()
        Lamp.turnOff()
        Lamp.displayLightStatus()
        assertEquals(Lamp.isOn, false)
    }
}