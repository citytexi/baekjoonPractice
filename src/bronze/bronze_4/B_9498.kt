package bronze.bronze_4

import java.util.*

class B_9498{
    fun solution(){
        val sc = Scanner(System.`in`)
        var num1 = sc.nextInt()
        if (num1 in 0..100){
            when {
                num1 in 90..100 -> {
                    println("A")
                }
                num1 in 80..89 -> {
                    println("B")
                }
                num1 in 70..79  -> {
                    println("C")
                }
                num1 in 60..69 -> {
                    println("D")
                }
                num1 < 60 -> {
                    println("F")
                }
            }
        }
    }
}

fun main(){
    val test = B_9498()
    test.solution()
}