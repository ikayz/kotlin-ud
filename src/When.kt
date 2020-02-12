/*
Created by ikayz on 12/02/2020
*/
fun main(args: Array<String>) {
    println("=== Isaac's Pizza Parlour Menu ===")
    println("1. Hawaiian 2. Margaretta 3. Chicken Salami 4. Vegetarian")
    println("enter pizza number: ")
    val pizzaId: Int = readLine()!!.toInt()

    when(pizzaId) {
        1 -> println("You ordered Hawaiian.")
        2 -> println("You ordered Margaretta.")
        3 -> println("You ordered Chicken Salami.")
        4 -> println("You ordered Vegetarian.")
        else -> println("You did not order anything from the menu.")
    }
}