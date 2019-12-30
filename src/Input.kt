/*
Created by ikayz on 30/12/2019
*/
fun main() {
    print("Enter name: ")
    var name = readLine().toString()
    print("Enter age: ")
    val age = readLine()!!.toInt()
    print("Enter height: ")
    val height = readLine()!!.toDouble()
    print("Enter country: ")
    var country = readLine().toString()

    println("==== User Info ====")
    println("Name: $name")
    println("Age: $age")
    println("Height: $height")
    println("Country: $country")
}