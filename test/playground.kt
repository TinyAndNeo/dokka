// this file is not included in sources or tests, you can play with it for debug purposes
// Console run configuration will analyse it and provide lots of debug output

fun topLevelFunction() {
}

val topLevelConstantValue = "Hello"

val topLevelValue : String
    get() = "Bye bye"

var topLevelVariable : String
    get() = "Modify me!"
    set(value) {
    }

/**
 * This is a class
 */
class Class {
    fun memberFunction() {
    }

}

object Object {
    fun objectFunction() {
    }
}

class OuterClass {

    class NestedClass {
        fun nestedClassFunction() {
        }
    }

    inner class InnerClass {
        fun innerClassFunction() {
        }
    }

    object NestedObject {
        fun nestedObjectFunction() {
        }
    }
}