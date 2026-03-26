//  1. Using if statements or when statement, create a program to find if given year is leap or not 
fun main() {
    for (year in 2000..2024) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            println("$year is a leap year")
        } else {
            println("$year is NOT a leap year")
        }
    }

    //2. Using if statements check if a given number is ODD or Even
    val number = 0

 if (number % 2 == 0) {
    println("$number is Even")
} else {
    println("$number is Odd")
}

}







