/*
Created by ikayz on 27/02/2020
*/
fun main() {
    println("=== Break and Continue ===")

    loop@ for (i in 1..10) {
        println("Value of i is : $i")
        for (j in 1..5) {
            println("Inner loop: $j")
            if (j == 3) {
                println("We hit continue.")
                continue
            } else if(i == 2) {
                return@loop
            }
        }
    }
}