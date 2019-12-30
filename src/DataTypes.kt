/*
Created by ikayz on 30/12/2019
*/
fun main() {
    var name = "Isaac"
    val age: Int = 28
    val height: Double = 1.66
    var country: String?
    var male: Boolean?
    male = false
    country = null
    male = true
    println("Is he a male? $male")
    country = "Zambia"
    println("His name is $name he is $age years old, with a height of $height and lives in $country")
    println("These are the details we got from him: ${name + ' ' + age + ' ' + height + ' ' + country + ' ' + male}")
    println("That's a good start on the basics of data types.")
}