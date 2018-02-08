import java.io.File
import java.util.*

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Requires a class name as argument to program")
        System.exit(-1)
    }

    System.out.println("What file do you want me to read?\n(Type the name of the file without the extension): ")
    val thisFile: String? = readLine()
    if (thisFile == "") println("No file then? OK")
    else read(thisFile)
}

fun read(fileName: String?) {
    val theName = Class.forName(fileName)
    println(theName)
}
