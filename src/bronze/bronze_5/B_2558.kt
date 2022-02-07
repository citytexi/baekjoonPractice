package bronze.bronze_5

/**
 * @문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
**/

class B_2558{
    fun solution() = with(System.`in`.bufferedReader()){
        val n = readLine().toInt()
        val f = readLine().toInt()
        println(n+f)
    }
}

fun main(){
    val test = B_2558()
    test.solution()
}