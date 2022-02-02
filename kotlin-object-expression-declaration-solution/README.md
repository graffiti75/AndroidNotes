
# Object expression declaration

# Topics
- Object expression declaration

## Basic Requirements

Complete exercises below, and Unit Tests (when required)

## Exercise 1. Click Listener

- Given the code below, implement inside function `main`:
  - A `Button` variable
  - Then make it `click` (for this you need to implement an `object` of type `OnClickListener`)

```
abstract class View {
    lateinit var clickListener: OnClickListener

    fun click() {
        clickListener.onClick()
    }
}

class Button: View()

interface OnClickListener {
    fun onClick()
}
```

### Solution

- Check the source code

## Exercise 2. Lamp

- Create an object `Lamp` with a `Boolean` attribute `isOn` (with default value of `false`)
- This object must have the following methods:
  - `turnOn`: switch value of `isOn` to `true`
  - `turnOff`: switch value of `isOn` to `false`
  - `displayLightStatus`: print `Lamp is on` or `Lamp is off` depending of the object attribute

### Solution

- Check the source code

## Exercise 3. Lamp Unit Test

- Create an Unit Test `givenLampTurnedOnAndOff_thenReturnCurrentStatus` that checks the `Lamp` status after we switch it to On and Off

### Solution

- Check the source code

## Resources

- [Object expression declaration](https://play.kotlinlang.org/byExample/03_special_classes/04_Object)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._
