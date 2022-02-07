package bronze.bronze_5

class B_1271{
    fun solution() = with(System.`in`.bufferedReader()){
        val (m, n) = readLine().split(" ").map { it.toBigInteger() }
        println(m/n)
        println(m%n)
    }
}

fun main(){
    val test = B_1271()
    test.solution()
}