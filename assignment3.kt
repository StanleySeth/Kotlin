// create assignment3.kt and by use of for loop, create an array of 7 counties and loop through them.
fun main() {
    val countries = arrayOf("Kenya", "Senegal", "Liberia", "Nigeria", "Zimbabwe", "Madagascar", "Seychelles")
    for (country in countries){
        println(countries.contentToString())
    }

    println("======================================================")
    // On the book do the assignments on page 29 and 30
    //Create a For loop to print year from 2000 to 2025
     
    for (year in 2000..2025){
        println(year)
    }

    println("======================================================")
    // Create a For loop to print from 100 to 1
    for (number in 100 downTo 1){
        println(number)
    }

    //Create a while loop to print from -20 to +20
    println("======================================================")
    var num = -20
    while (num >= -20 && num <=20){
        println(num)
        num++
    }



    //Create a while loop to print all EVEN years from 2000 to 2025.
    println("======================================================")
      var years = 2000
    while (years >= 2000 && years <=2025){
        println(years)
        years +=2
        
    }
    


    
}

