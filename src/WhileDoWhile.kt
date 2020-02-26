/*
Created by ikayz on 26/02/2020
*/
fun main() {
    println("==== While Do While ====")
    for(i: Int in 1..10 step 2) {
        println("The value of $i")
    }

    println("==== Step 1 ====")

    var i = 1
    while(i <= 10) {
        println("The number is $i")
        i += 1
    }
    i = 1
    do{
        println("Printing $i")
        i +=2
    } while (i <= 10)
}