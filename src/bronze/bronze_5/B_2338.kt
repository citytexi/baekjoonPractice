package bronze.bronze_5

import java.math.BigInteger

class B_2338{
    fun solution() = with(System.`in`.bufferedReader()){
        val a: BigInteger = readLine().toString().toBigInteger()
        val b: BigInteger = readLine().toString().toBigInteger()
        println(a+b)
        println(a-b)
        println(a*b)
    }
}

fun main(){
    val test = B_2338()
    test.solution()
}