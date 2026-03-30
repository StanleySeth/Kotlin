//WHEN STATEMENT
//The when statement in kotlin is like a switch case in other languages. It checks a value against ultiple conditions and executes the matching block.
fun main() {
    val marks = 10

when (marks) {
    in 1..30 -> println("You Failed")
    in 31..50 -> println("You Are Average")
    in 51..70 -> println("You are Above Average")
    in 71..100 -> println("You Passed")
    else -> println("Invalid Scores...!")
}
}
