/*
Created by ikayz on 12/02/2020
*/
fun main(args: Array<String>) {
    println("=== If Else If Else ===")
    println("Enter name: ")
    val name: String = readLine().toString()
    println("Enter marks: ")
    val marks: Int = readLine()!!.toInt()

    if(marks >= 80) {
        println("You got an A $name")
    } else if(marks in 70..79) {
        println("You got a B $name")
    } else if(marks in 60..69) {
        println("You got a C $name")
    } else {
        println("You failed $name")
    }
}