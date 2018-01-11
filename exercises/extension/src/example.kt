fun main(args: Array<String>) {
    val l = mutableListOf(1, 2, 3)
    println(l)
    l.add(12)
    println(l)
    l[0] = 99
    println(l)
    l.swap(0,2)
    println(l)

    val lst = mutableListOf("asda", "tesco", "lidl")
    println(lst)
    lst.swap(0,2)
    println(lst)
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}