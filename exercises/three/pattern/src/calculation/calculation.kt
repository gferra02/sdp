package calculation

// Calculation type
// succeeds with an Int result
// fails with a String message result

sealed class calculation
data class success(val result: Int): calculation()
data class failure(val result: String): calculation()

//fun main(args: Array<String>) {
//
//}

// Traffic light is red, green or amber

sealed class trafficLight (val color: String)
object red: trafficLight("red")
object green: trafficLight("green")
object amber: trafficLight("amber")

fun main(args: Array<String>) {
    val isRed : trafficLight = red

    println("The traffic light is: " + isRed.color)
}