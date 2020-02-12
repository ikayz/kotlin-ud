/*
Created by ikayz on 12/02/2020
*/
fun main(args: Array<String>) {
    println("Enter GPA: ")
    var GPA = readLine()!!.toDouble()
    var isMarried = false

    val isQualified = if(GPA >= 3.5 && isMarried) 1 else 0
    println(isQualified)

    // Condition when something is true else false
    val isPerfect = when(GPA) {
        4.0 -> true
        else -> false
    }

    println(isPerfect)
}