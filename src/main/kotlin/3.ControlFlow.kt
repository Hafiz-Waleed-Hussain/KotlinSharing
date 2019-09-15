import java.lang.NumberFormatException
import kotlin.random.Random

fun main() {
//In Kotlin, we have mostly the same control flow which other languages have,
// like if, else, while, for, when
// but there is one huge difference, in some of the keywords which we will discuss now.

// Statement Vs Expression
// Statement do an action and not able to return any value
// Expression do some operation and return a value, which we can assign to some variable


    //<editor-fold desc="Statement">
    // If as a Statement
//    var s: String? = null
//    val age = Random.nextInt(0,21)
//
//    if (age > 18){
//        s = "Adult"
//    }else{
//        s= "Not Adult"
//    }
//
//    println(s)
    //</editor-fold>

    //<editor-fold desc="Expression">
    // Expression
//    val sum = 5 + 8
    // Here 5 and 8 are operands, + is an operator, as a whole 5 + 8 is called expression which will return  value
    //</editor-fold>

    //<editor-fold desc="If else">
//  // In Kotlin, if else are the expressions not the statement

//    val valueA = 3
//    val valueB = 6
//    var maxValue : Int? = null
//    if(valueA > valueB)
//        maxValue = valueA
//    else
//        maxValue = valueB
//
//
//    maxValue = if(valueA > valueB)
//        valueA
//    else
//        valueB
    //</editor-fold>

    //<editor-fold desc="Multiple Lines in If else block">

//    val valueA = 3
//    val valueB = 6
//    var maxValue : Int? = null
//    maxValue = if(valueA > valueB) {
//        println("Process values")
//        valueA
//    }
//    else {
//        println("Process values")
//        valueB
//    }


    //</editor-fold>

    //<editor-fold desc="If else as an expression make concise code ">
//    var s: String? = null
//    val age = Random.nextInt(0, 21)
//
//    if (age > 18) {
//        s = "Adult"
//    } else {
//        s = "Not Adult"
//    }
//
//    println(s)
//
//    println(if( age > 18) "Adult" else "Not Adult")

    //</editor-fold>

    //<editor-fold desc="If else expression with String Interpolation">
//    var books = 1
//    println("You bought $books book${if(books > 1) "s" else "" }")
    //</editor-fold>

    //<editor-fold desc="When Expression">
    // When Expressions
    // In Java we have a switch keyword, in kotlin we have when expression which is really powerful.
    // Also when is an expression
    //</editor-fold>

    //<editor-fold desc="When with Int type">

/*
    val price = 100
    when (price) {
        100 -> println("Price is equal to 100")
        200 -> println("Price is equal to 200")
        300 -> println("Price is equal to 300")
        else -> println("Price is not equal to 100,200 and 300")
    }*/


/*
    val price = 100
    when (price) {
        100,200 -> println("Price is equal to 100 or 200")
        300 -> println("Price is equal to 300")
        else -> println("Price is not equal to 100,200 and 300")
    }
*/

/*
    val price = 150
    when (price) {
        in 100..200 -> println("Price is in between 100 to 200")
        else -> println("Price is not between 100 to 200")
    }
*/

/*
    val price = 150
    when (price) {
        !in 100..200 -> println("Price is not in between 100 to 200")
        else -> println("Price is between 100 to 200")
    }
*/

    //</editor-fold>

    //<editor-fold desc="When with Strings">
/*
    val fruit = "Apple"
    when (fruit) {
        "Apple" -> {
            println("This is an Apple")
        }
            ,
        "Orange" -> {
            println("This is an Orange")
        }
        else -> {
            println("Sorry :(")
        }
    }
*/
    //</editor-fold>

    //<editor-fold desc="When with Data Types">
    // When with Data Type, we will get free smart casting

/*
    val type: Any = "Hello"

    when (type) {
        is String -> println(type)
        is Int -> println(type)
        is Float -> println(type)
        else -> println("Sorry :(")
    }
*/
    //</editor-fold>

    //<editor-fold desc="When without argument">

/*
    fun isValid(s: String) : Boolean { return s.length > 2 }
    val name = "Hafiz Waleed Hussain"

    when{
        isValid(name) -> println("Valid name")
        else -> println("Not a valid name")

    }
*/

/*
    val password = "Password"
    when{
        password.length > 100 -> println("Strong Password")
        password.split(" ").isNotEmpty() -> println("Good Password")
        else -> println("Normal Password")
    }
*/

    //</editor-fold>

    //<editor-fold desc="When exhaustive">

/*
    fun isMale(boolean: Boolean): Boolean{
        return when(boolean){
        }
    }
*/

    // Give an example with Sealed class. So we can see the power of when exhaustive
    //</editor-fold>

    //<editor-fold desc="Loops">
    // In Kotlin we have three type of loops for, while and do while.

//    val list = ('a'..'z').toList()

//    for (i in list)
//        println(i)

//    for (i in 0..list.size-1)
//        println(i)

//    for (index in list.indices)
//        println(index)

//    for (i in 1..4)
//        println(i)

//    for( i in 4 downTo -2)
//        println(i)

//    for( i in 4 downTo -2 step 2)
//        println(i)

//    for( i in 4 downTo -2 step 3)
//        println(i)

//    for (withIndex in list.withIndex()) {
//        withIndex.index
//        withIndex.value
//    }

//    for ((index, value) in list.withIndex()) {
//        println("$index : $value")
//    }

//    val value = 10
//    while(2 > value)
//        println("While loop is running")
    //</editor-fold>

    //<editor-fold desc="Jumps">
    //Kotlin support return, break and continue

//    fun allAdult(data: List<Int>): Boolean {
//        for (d in data) if (d < 18) return false
//        return true
//    }

//    for(i in 0..100){
//        if(i == 50)
//            break
//    }

//    for(i in 0..10){
//        if(i == 5)
//            continue
//        println(i)
//    }


    // Copy below example from Kotlin.org https://kotlinlang.org/docs/reference/returns.html

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return // non-local return directly to the caller of foo()
//            println(it)
//        }
//        println("this point is unreachable")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach lit@{
//            if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
//            println(it)
//        }
//        print(" done with explicit label")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
//            print(it)
//        }
//        print(" done with implicit label")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
//            if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
//            print(value)
//        })
//        print(" done with anonymous function")
//    }


//    foo()

    //</editor-fold>

    //<editor-fold desc="Exceptions Try Catch">
    //In Kotlin, try catch are expressions
    // In Kotlin, all exceptions are unchecked

//    val e = try {
//        "Try"
//    }catch (e: NumberFormatException){
//        "Catch"
//    }
//    println(e)

//    val e = try {
//        "Try".toInt()
//    } catch (e: NumberFormatException) {
//        "Catch"
//    }
//    println(e)

//    try {
//        "Try".toInt()
//    } catch (e: NumberFormatException) {
//        "Catch"
//    }.let(::println)

//    try {
//        "Try".toInt()
//    } catch (e: NumberFormatException) {
//        "Catch"
//    } finally {
//        "Finally"
//    }.let(::println)


    //</editor-fold>

}
