//
class Circle {
    //Properties of a circle
    var radius = 7
    var pie = 3.142

    //Behaviours
    fun circleArea() {
        val areaOfCircle = pie * radius * radius
        println("The area of the circle is: " + areaOfCircle)
    }
    
    fun circleCircumference() {
        val circumference = 2 * pie * radius
        println("The perimeter of the circle is: " + circumference)
    }
    
}

//Create a class for rectangle and find the area as well as the perimeter of the rectangle
class Rectangle {
    var length = 20
    var width = 5

    fun rectArea() {
        val areaOfRectangle = length * width
        println("The area of the rectangle is: " + areaOfRectangle)
    }

    fun rectPerimeter() {
        val perimeterOfRectangle = 2*(length + width)
        println("The perimeter of the rectangle is: " + perimeterOfRectangle)
    }
    
}



fun main() {
    //Below is our object
    var myCircle = Circle()
    var myRectangle = Rectangle()

    myCircle.circleArea()
    myCircle.circleCircumference()

    println("=========================================")

    myRectangle.rectArea()
    myRectangle.rectPerimeter()
}