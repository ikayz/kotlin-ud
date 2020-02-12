/*
Created by ikayz on 12/02/2020
*/
fun main(args: Array<String>) {
    println("=== If Else If Else ===")
    println("Enter name: ")
    val name: String = readLine().toString()
    println("Enter marks: ")
    val marks: Int = readLine()!!.toInt()

    if(marks >= 90) {
        if(marks > 95) {
            println("You got an A+, $name")
        } else {
            println("You got an A, $name")
        }
    } else if(marks in 80..89) {
        if(marks > 85) {
            println("You got a B+, $name")
        } else {
            println("You got a B, $name")
        }
    } else if(marks in 70..79) {
        if(marks > 70) {
            println("You got a C+, $name")
        } else {
            println("You got a C, $name")
        }
    } else {
        println("You failed $name")
    }
}