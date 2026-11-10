fun main() {
    val letters = listOf("a", "b", "c", "b")
    println(letters[0])
    println(letters.get(0))

    //letters[3]

    println(letters.indexOf("b"))

    //letters.add("d") error

    val letters2 = arrayListOf("a", "b","c")
    letters2.add("a")
    println(letters2)
    letters2.remove("a")
    println(letters2)

    letters2.addAll(letters)
    println(letters2)

    letters2.removeAll(letters)
    println(letters2)

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
    println(items)
}