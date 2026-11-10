interface CoffeShop {
    var coffee: String
    fun askCoffee()
    fun getCoffee()
    fun makeCoffee() {
        println("making $coffee coffee")
    }

}

class CoffeeType(type: String): CoffeShop {
    override var coffee = type

    override fun askCoffee() {
        println("Asking for a coffee")//2
    }

    override fun getCoffee() {
        println("Getting the coffee and drinking it")//3
    }
}

fun coffeeRobusta(): CoffeShop = CoffeeType("Robusta")
fun coffeeArabic(): CoffeShop = CoffeeType("Arabic")
fun main() {
    val myCoffee = coffeeRobusta()
    myCoffee.askCoffee()
    myCoffee.makeCoffee()
    myCoffee.getCoffee()

    val yourCoffee = coffeeArabic()
    yourCoffee.askCoffee()
    yourCoffee.makeCoffee()
    yourCoffee.getCoffee()
}