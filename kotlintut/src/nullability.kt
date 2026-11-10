fun main() {
    var catName: String? = "Fluffy"
    //catName = null

    println(catName)

    println(catName?.length)

    println(catName ?: "This cat has no name")

    println(catName!!.length) // error if the value here is null

    var amount: Int? = 4

    println(amount?.times(3))
}