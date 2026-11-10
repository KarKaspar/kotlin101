class GType<T> {
    fun display(item: T) {
        println("the items are ${item.toString()}")
    }
}

fun main() {
    val myArray = arrayListOf<String>()

    val myBox = GType<String>()
    myBox.display("Contents")//1

    val yourBox = GType<Int>()
    yourBox.display(42)//2
}
