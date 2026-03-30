class Person {
    //Attributes/characteristics/properties of a person
    var name = "Stanley"
    var age = 19

    //Behaviour/ actions/ doables
    fun walk() {
        println("The person can walk")
    }


    fun speak() {
        println("The person can speak...")
    }

    fun write() {
        println("The person can write...")
    }

    fun talent() {
        println("The person can play football")
    }
    
}

fun main() {
    // Objects is a real world thing 
    //An object is intanciated/created/obtained/memanated from class
    //For us to be able to either access the properties/behaviours of a class we require to have an object    

    //Below we create an object
    var myObject = Person()

    //Below we use the dot seperator to access either the function or the properties
    myObject.walk()
    myObject.write()
    myObject.talent()
    println("The age of the person is: " + myObject.age)
}