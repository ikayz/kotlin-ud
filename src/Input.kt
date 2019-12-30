/*
Created by ikayz on 30/12/2019
*/
fun main() {
    // Ask for name as a string value
    print("Enter name: ")
    var name = readLine().toString()
    // Ask for age as an integer value
    print("Enter age: ")
    val age = readLine()!!.toInt()
    // Ask for height as a double value
    print("Enter height: ")
    val height = readLine()!!.toDouble()
    // Ask for country as a string value
    print("Enter country: ")
    var country = readLine().toString()

    println("==== User Info ====")
    println("Name: $name")
    println("Age: $age")
    println("Height: $height")
    println("Country: $country")
}