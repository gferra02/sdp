package one

class Person (val firstName: String,
              val lastName: String,
              val age: Int) {

    // constructor(firstName: String): this(firstName, "Jones")

    override fun toString(): String {
        // return firstName + " " + lastName + ", " + age

        // Interpolated string
        return "one.Person $firstName $lastName is $age years old"
    }
}

fun main (args: Array<String>) {
    val p = Person("John", "Doe", 97)
    val p2 = Person("Jane", "Doe", 97)

    println(p)
    println(p2)

    val p3 = Person("Bart", "Simpson", 11)

    // p3 = Person("Lisa")

    println(p3)

}