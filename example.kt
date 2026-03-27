fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu") 

    for (i in counties.indices) {
        // Print only the counties at index 0 and 2
        if (i == 0 || i == 2) {
            println("County: ${counties[i]}")
        }
    }
}