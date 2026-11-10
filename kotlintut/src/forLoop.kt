fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear")
    for (animal in animals) {
        println("Feeding the $animal")
    }

    for (i in 1..3) {
        println("Strike $i")
    }
    println("You're out!")

    for (i in 10 downTo 0 step 3) {
        println(i)
    }

    for (i in 0 .. 5) {
        for (j in 0 .. 5) {
            print("$i, $j\t")
        }
        println()
    }

    var year = 2026
    val months = listOf("Jaanuar", "Veebruar", "Marts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember")
    for (month in months) {
        if (month == "Aprill" || month == "Juuni" || month == "September" || month == "November") {
            println("30 paeva on $month")
        } else if (month == "Veebruar" && year % 4 == 0) {
            println("29 paeva on $month")
        } else if (month == "Veebruar" && year % 4 != 0) {
            println("28 paeva on $month")
        } else {
            println("31 paeva on $month")
        }
    }
}