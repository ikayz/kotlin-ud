import java.util.*

/*
Created by ikayz on 06/01/2020
*/
fun main() {
    println("== Age Calculator App ==")

    // Get the year from device
    val currentYearFromDevice = Calendar.getInstance().get(Calendar.YEAR)
    println(currentYearFromDevice)
    println("Enter birth year: ")
    val birthYear: Int = readLine()!!.toInt()

    // Calculate age
    val age = currentYearFromDevice - birthYear
    println("Your age is $age years old")
}