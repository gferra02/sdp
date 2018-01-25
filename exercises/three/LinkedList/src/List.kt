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
    val newList = listOf(1, 2, 3)

    println(newList)
}
