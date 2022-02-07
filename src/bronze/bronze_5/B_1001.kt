package bronze.bronze_5

import java.util.*

/**
 * @문제
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * @출력
 * 첫째 줄에 A-B를 출력한다.
 **/

class B_1001{
    fun solution(){
        val sc = Scanner(System.`in`)
        val n1 = sc.nextInt()
        val n2 = sc.nextInt()
        println(n1-n2)
    }
}

fun main(){
    val test = B_1000()
    test.solution()
}