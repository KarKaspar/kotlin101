fun main() {
    val translation = mapOf("one" to "uks", "two" to "kaks", "three" to "kolm")

    println(translation)

    println(translation.get("two"))
    println(translation["one"])

    println(translation.keys)

    val count = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    count.put(4, "four")
    println(count)

    count.replace(2, "twenty two")
    println(count)

    count.clear()
    println(count)

    var attendance = hashMapOf("23 Sept" to 2837, "24 Sept" to 3726, "25 Sept" to 6253)
    attendance.put("26 Sept",  1111)
    var sum1 = attendance.get("25 Sept") ?: 0
    var sum2 = attendance.get("26 Sept") ?: 0
    println(sum1)
    println(sum2)
    println(sum1 + sum2)

    if (attendance.get("22 Sept")==null) {
        println(false)
    } else {
        println(true)
    }
}