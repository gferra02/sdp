package three

// is-a "and"
// a type conforms to a number of requirements
// "Cake pattern"
// Sharing impl no default impl "mixin" OOP parlance

interface B
interface C
interface A : B, C

// has-a "or" A has a B or a C
// A has a d of type D where D is a B or a C

interface AA {
    var d: D
}

sealed class D
class BB : D()
class CC : D()

// Another way of doing it (has-a):

sealed class AAA
data class DD(val b: BB) : AAA()
data class EE(val c: CC) : AAA()