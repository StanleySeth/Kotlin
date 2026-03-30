fun main() {
    fun addition (){
         val number1 = 10
    val number2 = 20
    val sum = number1 + number2

    println("The sum of the numbers is: $sum")

    }
   addition()

println("================================")

   //Crate a function that is able to multiply 3 numbers
   fun multiply (){
    val number3 = 10
    val number4 = 20
    val product = number3 * number4

    println("The product of the numbers is: $product")

    }
   multiply()

println("================================")
    fun sort (){
        val number5 = 70
        val number6 = 90
         if (number5 > number6) {
        println("$number5 is the Largest number")
    } else if (number6 > number5) {
        println("$number6 is the Largest number")
    } else {
        println("Both numbers are equal")
    }

        
        sort()

    }

println("=============================")
   // Given 179 minutes, create a function that is able to convert the said minutes into hours and to show the remainder of the  minutes.
   fun time (){
    val minutes = 179
    val hours = 179 / 60
    val remainder = 179 % 60
    println("This is the output: $hours hours $remainder minutes")

   }

   time()

}