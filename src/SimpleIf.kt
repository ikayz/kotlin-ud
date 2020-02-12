/*
Created by ikayz on 12/02/2020
*/
fun main() {
    println("=== Simple IF ===")
    println("Enter age: ")
    val age = readLine()!!.toInt()

    if(age in 18..60) {
        println("You do not qualify for free insurance.")
    }

    if(age < 18) {
        println("You qualify for free insurance.")
    }
}