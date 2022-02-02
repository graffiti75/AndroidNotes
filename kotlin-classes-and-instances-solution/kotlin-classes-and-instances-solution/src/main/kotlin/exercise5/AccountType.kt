package exercise5

enum class AccountType(val discountPercent: Int, val numberOfSubscriptions: Int) {
    BRONZE(10, 1) {
        override fun calculateSpecialDiscountPercent() = 15
    },
    SILVER(15, 5) {
        override fun calculateSpecialDiscountPercent() = 20
    },
    GOLD(20, 10) {
        override fun calculateSpecialDiscountPercent() = 25
    },
    PLATINUM(25, 15) {
        override fun calculateSpecialDiscountPercent() = 30
    };

    abstract fun calculateSpecialDiscountPercent(): Int

    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.toUpperCase())
    }
}

fun main() {
    println(AccountType.GOLD)
    println(AccountType.GOLD.discountPercent)

    val value = AccountType.valueOf("Platinum".toUpperCase())
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscriptions)
    println(value.calculateSpecialDiscountPercent())

    val accountType = AccountType.getAccountTypeByName("gold")
    println(accountType)
}