fun main() {
    //FOR Loop 
//It is used to execute a block of code/statement a number of times until a condition is meant
for(number in 1..10 step 2){
    println("The count is: $number")
}
println("==============================")
//Create a FOR loop that is able to print from 50 to 65

for(num in 50..65){
    println("The count is: $num")
}


println("==============================")

for(N in 20..40 step 2){
    println("The count is: $N")
}

//Below we find the odd number in a given range
println("==============================")

for(X in 20..40){
    if (X % 2 != 0)
    println(X)
}

println("==============================")

//Generate a table for the multiplications of 5

for (M in 1..5) {
        val fact = M * 5
        println("5 * $M = $fact")
    }

    println("==============================")

    //Create a program that is able to find the factorial of number 5
    var F =1

    for (a in 1..5){
       F *=a
        println("The factorial of $a is $F")
        
    }


}
