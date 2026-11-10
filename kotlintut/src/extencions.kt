fun String.slim() = this.substring(1, length-1)

val String.betterLength: Int
    get() = 200

fun main() {
    val name = "Michael"
    println(name.slim())

    println(name.betterLength)

    Book.printMe()
}

fun Book.Companion.printMe() {
    println("Book has been printed")
}

class Book {
    companion object {}
}