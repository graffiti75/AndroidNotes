class SpecialFunctions {
    fun init(a: Int, b: Int): Int {
        val f = fun(a: Int, b: Int): Int {
            return a * b
        }

        val s = { a: Int, b: Int -> a - b }

        return f(a, b) + s(a, b)
    }
}