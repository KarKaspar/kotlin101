fun main() {
    println(true && true)

    val isDog = true
    val isBlack = false

    val blackDog = isDog && isBlack

    println(blackDog)

    /*if (blackDog) {
        println("I found a black dog")
    } else {
        println("No black dogs around")
    }*/

    println(isDog == true)

    val age = 15
    val isHuman = false

    val isTeenager = ((age >= 13) && (age < 20)) && isHuman

    println("isTeenager=$isTeenager")

    var cows = 3
    var children = 2
    var sellMilk = true

    val maxAnimals = 5
    val sellTrue = true
    val members = 3

    println((cows <= maxAnimals) && (sellMilk == sellTrue) || ((children + 1) >= members))
}