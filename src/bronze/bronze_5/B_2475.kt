package bronze.bronze_5

class B_2475{
    fun solution() = with(System.`in`.bufferedReader()){
        val a: List<Int> = readLine().split(" ").map { it.toInt() }
        var result = 0
        for (i in a.indices){
            result += a[i] * a[i]
        }
        println(result%10)
    }
}

fun main(){
    val test = B_2475()
    test.solution()
}