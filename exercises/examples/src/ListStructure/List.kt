package ListStructure

sealed class List<T>
class Node<T> (val value: T, val next: List<T>): List<T>()
object Empty: List<Nothing>()

fun <T> isEmpty(l: List<T>) = when(l) {
    is Node -> false
    is Empty -> true
}

fun <T> size(l: List<T>): Int = when(l) {
    is Node -> 1 + size(l.next)
    is Empty -> 0
}

fun <T> head(l: List<T>) = when (l) {
    is Node<T> -> l.value
    is Empty -> throw RuntimeException("Empty list")
}

fun main (args: Array<String>) {
//    val newList = listOf(1, 2, 3)
//    println(newList)

    val l = Node(1, Node(2, Node(3, Empty)))
    println(l)
    val end = Empty
    val list = Node(3, end)
    println(list)


    // val item = Item(3, "aString")  // Structure
    // val (value1, value2) = afunc()      // We can pull it apart

    // println(value1)

    // Another example of destructuring
    // val (value1, value2, name) = afunc2()

    assert(sum(l) == 6)
    assert(sum(Empty) == 0)
}


// Use TODO() as a placeholder

fun sum(list: List<Int>): Int = when (l) {
    is Node -> {
        val (value, next) = 1
        value + sum(next)
    }

    Empty -> 0
}


//data class Item(val a: Int, val b: Int)
//
//fun afunc(): Pair<Int, Int> {
//    return Pair(3, 4)
//}
//
//fun afunc2(): Triple<Int, Int, String> {
//    return Triple(3, 4, "five")
//}
