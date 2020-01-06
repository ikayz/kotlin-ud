/*
Created by ikayz on 06/01/2020
*/
fun main(args: Array<String>) {
    println("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    println("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    println("=== Results from simple calculator ===")
    val add = num1 + num2
    println("Addition: $add")

    val subt = num1 - num2
    println("Subtraction: $subt")

    val div = num1 / num2
    println("Division: $div")

    val mult = num1 * num2
    println("Multiply: $mult")

    val modu = num1 % num2
    println("Modulo: $modu")
}