package silver.silver_5

/**
 * @문제
 * 정수 집합 S가 주어졌을때, 다음 조건을 만족하는 구간 [A, B]를 좋은 구간이라고 한다.
 *      - A와 B는 양의 정수이고, A < B를 만족한다.
 *      - A ≤ x ≤ B를 만족하는 모든 정수 x가 집합 S에 속하지 않는다.
 * 집합 S와 n이 주어졌을 때, n을 포함하는 좋은 구간의 개수를 구해보자.
 *
 * @입력
 * 첫째 줄에 집합 S의 크기 L이 주어진다. 둘째 줄에는 집합에 포함된 정수가 주어진다. 셋째 줄에는 n이 주어진다.
 *
 * @출력
 * 첫째 줄에 n을 포함하는 좋은 구간의 개수를 출력한다.
 *
 * @제한
 * 1 ≤ L ≤ 50
 * 집합 S에는 중복되는 정수가 없다.
 * 집합 S에 포함된 모든 정수는 1보다 크거나 같고, 1,000보다 작거나 같다.
 * 1 ≤ n ≤ (집합 S에서 가장 큰 정수)
 **/

class S_1059{
    fun solution() = with(System.`in`.bufferedReader()){
//        TODO("n의 범위 때문에 집합 S 안에는 n보다 크거나 같은 원소가 항상 존재하지만, n보다 작은 원소는 없을 수 있습니다. 하지만 좋은 구간의 정의에 따라 A, B는 모두 양수이므로 구간의 개수를 구할 수 있습니다.")
        val l = readLine().toInt()
        val list = mutableListOf<Int>()
        readLine().split(" ").map { list.add(it.toInt()) }
        val n = readLine().toInt()
        var min = 0
        var max = 0
        var count = 0
        list.sort()
        for (i in list.indices){
            if (list[i] < n && list[i + 1] > n){
                min = list[i] + 1
                max = list[i+1] - 1
                for (j in min .. n){
                    for (t in max downTo n ){
                        if(j != t)
                            count++
                    }
                }
            }
        }
        println(count)
    }
}

fun main(){
    val test = S_1059()
    test.solution()
}