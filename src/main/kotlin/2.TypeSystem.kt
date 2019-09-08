import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*
import kotlin.random.Random


fun main() {


/*

Types
In Java, we have two: Primitive (Stack) and Reference (Heap) Types
Kotlin has only one object, but at compile level to JVM code, Kotlin take care of
primitive and reference types.


    Numbers: ( Base type of all numbers types )

    Type	Size (bits)
    Byte	8
    Short	16
    Int	    32
    Long	64
    Float	32
    Double	64

 */

    //<editor-fold desc="Numbers">


//    val number : Number
//    val byte: Byte = 1
//    val short: Short = 1
//    val integer: Int = 1
//    val long: Long = 1L
//    val float: Float = 1.0f
//    val double: Double = 1.0
//
//    2.toDouble()

//    val oneMillion : Int = 1000000
//    println(oneMillion)
//
//    val oneMillion : Int = 1_000_000
//    println(oneMillion)


    //</editor-fold>

    //<editor-fold desc="Character">

//    val character: Char = 'a'
//    println(character)
//    println(character.toInt())

    //</editor-fold>

    //<editor-fold desc="Boolean">
//    val b = true
//    val c = false

    //</editor-fold>

    //<editor-fold desc="Unit">
    // In java we have a void type, Unit is same like void in kotlin
//    val a : Unit = Unit
//    val returType = println()

    //</editor-fold>

    //<editor-fold desc="Variable types ">
    /*
    In kotlin we have val, var and const.
    var is a mutable type ( read, write )
    val is immutable and sometime's not, ( We will see in custom getters )

    const keyword
     */

//    var variable = 340
//    variable = 568
//
//    val value = 340
//    value = 568


    //</editor-fold>

    //<editor-fold desc="String">
    // Strings are immutable just like many other languages, instead Kotlin added many useful extension functions
    // on Strings in it's standard Library

//    val name: String = "Hafiz Waleed Hussain"
//    var fullName: String = "Hafiz "
//    fullName = "Waleed "
//    fullName = "Hussain"
//    println(fullName)

//    val rawString = """     Hello,
//        |Hi
//        |        .
//        |
//    """.trimMargin()
//    println(rawString)


    // String interpolation
//    val number: Int = 5
//    val string = "This is String: "
//    println(string + number)

//    val number: Int = 5
//    val string = "This is String: $number"
//    println(string)

//    val number: Int = 5
//    val string = "This is String: ${number.toDouble()}"
//    println(string)


    //</editor-fold>

    //<editor-fold desc="Type Inference">
    // As a java developer, I am amazed when I saw this feature the first time.

//    var string1 : String = "This is a String"
//    var string2 = "This is a String"
//
//    string1 = 1
////    string2 = 1 (Hint: Kotlin is a Strongly type language )


//     val string2   // In this case, what will be the compiler response?


//    var string2 : Any = "This is a String"
//    string2 = 1

    // What is Any?
    //</editor-fold>

    //<editor-fold desc="Reference Type">

    // In java Object is a Base type of All Reference Types.
    // In Kotlin Any is a Base type of All Types.

//    val o : Object
//    val a : Any

//    val int = 1
//    val string=  "string"
//    var any : Any = int
//    var any : Any = string


    //</editor-fold>

    //<editor-fold desc="Nothing">
    // Nothing is a subtype of every type
//    val abc = null
//    val  n : Nothing
//    TODO()
//    val b = "ABC"


    //</editor-fold>

    //<editor-fold desc="Null able">
    // A Billion Dollar Mistake ( Java Null Pointer Exception)
    // In Java 8 we have Optional class to take care of null issues.
    // In Kotlin Nullable is a part of a type system.

//    var nullable : String = null

//    var nullable : String? = null
//    println(nullable.length)


//    var nullable: String? = null
//    if (nullable != null) println(nullable.length) else println(-1)

//    // ?. safe call operator
//    var nullable: String? = null
//    println(nullable?.length)

//    // Chaining of Safe Call operators
//    var nullable: String? = null
//    println(nullable?.capitalize().length)
//    println(nullable?.capitalize()?.length)

//    // Convert nullable to non-nullable
//    var nullable: String? = null
//    nullable!!.length // Always try your best to don't use !!.

//    // ?: Elvis operator, default value in case of nullable value
//    var nullable: String? = null
//    println(nullable?.length ?: -1)

//   // Elvis operator always evaluate from left to right

//    var nullable1: String? = null
//    var nullable2: String? = null
//    nullable1?.length ?: nullable2?: -1

//   // Most amazing thing for me, In Kotlin Type System. Every non-null able type has it's equivalent null able type.
//   // Check TypeSystem png in resources.



    //</editor-fold>


}

