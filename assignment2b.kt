fun main() {
    val price = 20000

    if (price > 0 && price <= 100) {
        println("You do not qualify")
    } else if (price > 100 && price<= 400) {
        println("You win a Smartphone")
    } else if (price > 400 && price<= 1000) {
        println("You win a Laptop")
    } else if(price > 1000){
        println("You win a Trip to Canada")
    } else{
        println("Invalid input")
    }
    
}