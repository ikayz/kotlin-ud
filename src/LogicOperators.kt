/*
Created by ikayz on 17/01/2020
*/

/*
AND Gate (&&)
    true && true = true
    true && false = false
    false && true = false
    false && false = false

OR Gate (||)
    true && true = true
    true && false = true
    false && true = true
    false && false = false
NOT (!)
    True = False
    False = True
 */

fun main() {
    val age = 23
    println(if (age == 23) "You are quite youngish" else "You are a lil' bit old")
    if (age in 18..60) {
        println("You don't qualify for medical insurance")
    } else  {
        println("You qualify for insurance")
    }
}