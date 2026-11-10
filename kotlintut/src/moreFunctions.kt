fun main() {
    multiply1(3)
    multiply1(3, 8)

    sayHello("Mary", "John", "Aleks")

    listAnimals()
}

fun multiply1(number: Int) = number * 2
fun multiply1(number: Int, multiplier: Int) = number * multiplier

//fun multiply1(number: Int, multiplier: Int = 2) = number * multiplier

fun sayHello(vararg names: String) {
    for (name in names)
        println("Hello $name")
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val myAnimals = listOf("cat", "dog", "cow", "horse")
    for (animal in myAnimals)
        listOneAnimal(animal)
}