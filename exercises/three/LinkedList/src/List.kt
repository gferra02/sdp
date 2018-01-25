sealed class List<T> {
    class Node<T> (val value: T, val next: List<T>): List<T>()
    object Empty: List<Nothing>()
}

fun <T> isEmpty(l: List<T>) = when(l) {
    is List.Node -> false
    is List.Empty -> true
}

fun <T> size(l: List<T>): Int = when(l) {
    is List.Node -> 1 + size(l.next)
    is List.Empty -> 0
}

fun <T> head(l: List<T>) = when (l) {
    is List.Node<T> -> l.value
    is List.Empty -> throw RuntimeException("Empty list")
}

fun main (args: Array<String>) {
    val newList = listOf(1, 2, 3)

    println(newList)
}
