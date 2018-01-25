package two

// data class Person(val firstName: String, val lastName: String, val age: Int)
data class Student(val firstName: String,
                   val lastName: String,
                   val age: Int) : Person

open class A

open class B: A()

class C: B()

interface Person

fun main (args: Array<String>) {
    // val p = Person("John", "Doe", 97)
    // val p2 = Person("Jane", "Doe", 97)

    val p: Person = Student("John", "Doe", 97)
    val p2: Person = Student("Jane", "Doe", 97)

    println(p)
    println(p2)

    val p3: Person = Student("Bart", "Simpson", 11)

    println(p3)
}