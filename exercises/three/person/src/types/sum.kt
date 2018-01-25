package types

// A is a B or a C
// Feline is a cat, a lion or a tiger

// if A is a B or a C

//open class AA()
//class BB() : AA()
//class CC() : AA()

//// In Kotlin 1.2 should be able to do this:
//sealed class AA()
//data class BB() : AA()
//data class CC() : AA()

sealed class AA() {
    // Defining all the subtypes here, can't extend outside these subclasses
    class BB() : AA()
    class CC() : AA()
}

// Sum type pattern

