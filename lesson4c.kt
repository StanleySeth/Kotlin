fun main() {
    //Functions with parameters
    //Parameters are inputs that get passed as arguments when invoking a function
    //Note: For parameters you must specify their datatypes

    fun greeting(name : String) {
        println("Hello $name, Hope you had a good day?")
    }

    // the function is invoked, you pass a given name as an argument
    greeting("James")
    greeting("Bernard")


    println("====================================================")
    //Below is an example of a function that is able to calculate  BMI of a person
    fun BMI(weight : Double, height : Double) {
        val answer = weight / (height * height)
        println("The BMI of the person is: " + answer)
    }
    BMI(69.5, 1.73)

    // Create a function that accepts parameters and checks whether a given number is odd or even
    fun math(Even : Int){
        if(Even % 2 == 0){
        println("This is an Even number")
        }else{
            println("This is an Odd number")
        }      
    }
    math(81)



    // Create a function that accepts parameter that is able to do the convertion of degree celcius into farenhe... 
// Create a function that is able to calculate the compound interest of a person.

}