package types

class B
class C

data class A(val b: B, val c: C)

interface Ainterface {
    val b: B
    val c: C
}

// A 'Has-a' is also know as Product type pattern in Functional programming.