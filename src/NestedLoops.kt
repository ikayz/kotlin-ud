/*
Created by ikayz on 27/02/2020
*/
fun main() {
    println("=== Nested Loops ====")
    for(userID in 1..2) {
        println("Enter your name: ")
        var name = readLine()!!.toString()
        println("Enter your town: ")
        var town = readLine()!!.toString()
        println("Number of pets: ")
        val pets = readLine()!!.toInt()
        println("Pet name: ")
        var petName: String? = ""
        for (numberOfPets in 1..pets) {
            println("Enter $numberOfPets")
            petName = petName + readLine()!!.toString() + ", "
        }

        println("=== User Info ===")
        println("Name: $name")
        println("Town: $town")
        println("Pets: $petName")
        if(petName!!.contains("Dog")) {
            println("Congratulations, you've got an offer")
        }
    }
}