fun main() {
    val animal = "crocodile"
    var action: String
    when(animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }
    println(action)

    val month = "October"
    val days = when (month) {
        "April", "June", "September", "November" -> {
            println("do something")
            30
        }
        "February" -> 28
        else -> 31
    }
    println(days)

    var name = "Karl"
    val greeting = when (name[0].lowercase()) {
        "a", "b", "c" -> println("Hello $name there")
        "d", "e", "f" -> println("Hi $name")
        else -> println("Here again, $name!")
    }
}