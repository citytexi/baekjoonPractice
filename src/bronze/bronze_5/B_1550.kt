package bronze.bronze_5

import java.math.BigInteger
import kotlin.math.pow

class B_1550{
    fun solution() = with(System.`in`.bufferedReader()){
        val m = readLine()
        var result: BigInteger = 0.toBigInteger()
        for (i in m.indices){
            when(m[(m.length - 1) - i].toInt()){
                in 49 .. 57 -> result += if(i == 0) (m[(m.length - 1) - i].toInt() - 48).toBigInteger() else ((m[(m.length - 1) - i].toInt() - 48) * (16.0.pow(i))).toInt().toBigInteger()
                in 65 .. 70 -> result += if(i == 0) (m[(m.length - 1) - i].toInt() - 55).toBigInteger() else ((m[(m.length - 1) - i].toInt() - 55) * (16.0.pow(i))).toInt().toBigInteger()
            }
        }
        println(result)
    }
}

fun main(){
    val test = B_1550()
    test.solution()
}