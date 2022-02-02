package exercise1

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

fun main() {
    val button = Button()
    button.clickListener = object: OnClickListener {
        override fun onClick() {
            println("This was clicked")
        }
    }
    button.click()
}