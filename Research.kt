// Research on conditional statements in kotlin
fun main () {
    //THE IF CONDITIONAL STATEMENT
//1.If statement
val age = 18

if (age >= 18) {
    println("You are an adult")
}

//2.If-else statement
val number = 5

if (number % 2 == 0) {
    println("Even")
} else {
    println("Odd")
}

//3.If else-if else statement
val score = 75

if (score >= 90) {
    println("Grade A")
} else if (score >= 80) {
    println("Grade B")
} else if (score >= 70) {
    println("Grade C")
} else {
    println("Grade D")
}

    //WHEN CONDITIONAL STATEMENT
    val day = 3

when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    else -> println("Invalid day")
}

//when with multiple conditions
val x = 10

when (x) {
    1, 2, 3 -> println("Small number")
    in 4..10 -> println("Medium number")
    else -> println("Large number")
}

//when as an expression
val num = 7

val result = when {
    num % 2 == 0 -> "Even"
    else -> "Odd"
}

println(result)


    //NESTED CONDITIONALS
    val theAge : Int = 20
    val hasID = true

if (theAge >= 18) {
    if (hasID) {
        println("Entry allowed")
    } else {
        println("ID required")
    }
}


}

//Research on compiler construction and design
// Research on the looping structures in kotlin, how to create an array in kotlin
//Research on functions without parameters in kotlin