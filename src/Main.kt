import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("1 - +")
        println("2 - -")
        println("3 - *")
        println("4 - /")
        println("5 - %")
        println("6 - string addition")
        val operation = scanner.nextInt()
            println("First number: ")
            val num1 = scanner.nextDouble()

            println("Second Number: ")
            val num2 = scanner.nextDouble()
            val num3: Int = num1.toInt()
            val num4: Int = num2.toInt()
            when (operation) {
                1 -> println("$num1 + $num2 = ${num1 + num2}")
                2 -> println("$num1 - $num2 = ${num1 - num2}")
                3 -> println("$num1 * $num2 = ${num1 * num2}")
                4 -> {
                    if (num2 != 0.0) {
                        println("$num1 / $num2 = ${num1 / num2}")
                    } else {
                        println("You can't do it!")
                    }
                }

                5 -> {
                    if (num2 != 0.0) {
                        println("$num1 % $num2 = ${num1 % num2}")
                    } else {
                        println("You can't do it!")
                    }
                }
                6 -> println("$num1 + $num2 = ${num3.toString() + num4.toString()}")
                else -> println("Wrong operation choice")
            }
        }
    }
