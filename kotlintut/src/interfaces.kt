interface Oven {
    var temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook() {
        println("Cooking at $temperature degrees")
    }
}

class Samsung: Oven {
    override var temperature = 200
    val warrantyYears = 2

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }
}

fun ovenFactory(): Oven = Samsung()

fun main() {
    val myOven = ovenFactory()
    //myOven.warrantyYears
    myOven.turnOn()
    myOven.cook()
    myOven.turnOff()
}