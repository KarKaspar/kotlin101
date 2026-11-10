fun main() {
    var a = 25
    val b = 83.67
    val r = a * b
    println("$r ${r::class.java}")

    a++
    println(a)

    var bikes = 5
    bikes += 1
    println(bikes)

    bikes -= 1
    println(bikes)

    bikes *= 1
    println(bikes)

    bikes /= 1
    println(bikes)

    bikes %= 2
    println(bikes)

    val account = 18573
    var intress = 5.5
    var intress1 = (1+(intress/100))
    var multintress = intress1 * intress1
    multintress *= intress1
    multintress *= intress1
    multintress *= intress1
    println(multintress)
    var amount = multintress*account
    println(amount)

}