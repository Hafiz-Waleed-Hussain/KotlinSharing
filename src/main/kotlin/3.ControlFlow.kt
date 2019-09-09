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
    var books = 1
    println("You bought $books book${if(books > 1) "s" else "" }")
    //</editor-fold>


    // When Expressions
    // In Java we have a switch keyword, in kotlin we have when expression which is really powerful.


}