package bronze.bronze_4

import java.util.*

/**
 * @문제
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *
 * @출력
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *   - A가 B보다 큰 경우에는 '>'를 출력한다.
 *   - A가 B보다 작은 경우에는 '<'를 출력한다.
 *   - A와 B가 같은 경우에는 '=='를 출력한다.
 **/

class B_1330{
    fun solution(){
        val sc = Scanner(System.`in`)
        var num1 = sc.nextInt()
        var num2 = sc.nextInt()
        if (num1 in -10000..10000 && num2 in -10000..10000){
            if (num1>num2)
                println(">")
            else if(num1 < num2)
                println("<")
            else if(num1 == num2)
                println("==")
        }
    }
}

fun main(){
    val test = B_1330()
    test.solution()
}