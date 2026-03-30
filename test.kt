fun main() {
  
//Can you have a function without a function body?

val circle = Circle(5.0)   
 println("Area of circle: ${circle.area()}")
}


// Abstract class with a function that has no body
abstract class Shape {
    abstract fun area(): Double    
}

// Concrete subclass must provide the body
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
