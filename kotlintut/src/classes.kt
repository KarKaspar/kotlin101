class Calculator {
    var total = 0

    fun add(amount: Int) {
        total += amount
        println("$total")
    }

    fun subtract(amount: Int) {
        total -= amount
        println("$total")
    }
    fun multiply(amount: Int) {
        total *= amount
        println("$total")
    }
    fun divide(amount: Int) {
        total /= amount
        println("$total")
    }
    fun reset() {
        total = 0
        println("$total")
    }
}

fun main() {
    val myTotal = Calculator()

    myTotal.add(50)
    myTotal.reset()
    myTotal.add(50)
    myTotal.multiply(5)
    myTotal.subtract(50)
    myTotal.divide(2)

}