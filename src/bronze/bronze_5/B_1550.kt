package bronze.bronze_5

import java.math.BigInteger
import kotlin.math.pow

/**
 * @문제
 * 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 16진수 수가 주어진다.
 * 이 수의 최대 길이는 6글자이다.
 * 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다.
 * 또, 이 수는 음이 아닌 정수이다.
 *
 * @출력
 * 첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
 **/

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