fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Requires a class name as argument to program")
        System.exit(-1)
    }

    // TODO()

    read("aClassFile")

}

fun read(fileName: String) {
    val theName = Class.forName(fileName)
    println(theName)
}
