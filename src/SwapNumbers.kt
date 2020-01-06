/*
Created by ikayz on 30/12/2019
*/
fun main() {
    print("Enter first number: ")
    var num1: Int = readLine()!!.toInt()
    print("Enter second number: ")
    var num2: Int = readLine()!!.toInt()

    println("=== Before Swap ===")
    println("First number is: $num1")
    println("Second number is: $num2")

    val temp: Int = num1
    num1 = num2
    num2 = temp

    println("=== After Swap ===")
    println("First number is: $num1")
    println("Second number is: $num2")
}