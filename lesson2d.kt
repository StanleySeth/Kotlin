fun main() {
    val marks = -0

    if (marks > 0 && marks < 30) {
        println("You Failed")
    } else if (marks >= 30 && marks<= 50) {
        println("Average")
    } else if (marks > 50 && marks<= 70) {
        println("Above Average")
    } else if(marks > 70){
        println("Passed")
    } else{
        println("Invalid input")
    }
    
}