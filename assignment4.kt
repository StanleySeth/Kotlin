import kotlin.math.pow
fun main() {
    // Create a function that accepts parameter that is able to do the convertion of degree celcius into farenhe... 
//Far=(Cel*1.8)+32
fun conversion(celsius : Int) {
        val Farenheit = (celsius*1.8)+32
        println(Farenheit)
    }
    conversion(35)

// Create a function that is able to calculate the compound interest of a person.
//A=P*(1+r/100)^n*t
fun CI(P: Double, r: Double, n: Int, t: Int): Double {
    return P * (1+r/100).pow(n*t)
    
}
val Amount = CI(50000.0, 5.0, 4, 2)
println(Amount)
    
}
