package silver.silver_4

/**
 * @문제
 * 8*8크기의 체스판에 왕이 하나 있다.
 * 킹의 현재 위치가 주어진다. 체스판에서 말의 위치는 다음과 같이 주어진다.
 * 알파벳 하나와 숫자 하나로 이루어져 있는데, 알파벳은 열을 상징하고, 숫자는 행을 상징한다.
 * 열은 가장 왼쪽 열이 A이고, 가장 오른쪽 열이 H까지 이고, 행은 가장 아래가 1이고 가장 위가 8이다.
 * 예를 들어, 왼쪽 아래 코너는 A1이고, 그 오른쪽 칸은 B1이다.
 * 킹은 다음과 같이 움직일 수 있다.
 *      R : 한 칸 오른쪽으로
 *      L : 한 칸 왼쪽으로
 *      B : 한 칸 아래로
 *      T : 한 칸 위로
 *      RT : 오른쪽 위 대각선으로
 *      LT : 왼쪽 위 대각선으로
 *      RB : 오른쪽 아래 대각선으로
 *      LB : 왼쪽 아래 대각선으로
 * 체스판에는 돌이 하나 있는데, 돌과 같은 곳으로 이동할 때는,
 * 돌을 킹이 움직인 방향과 같은 방향으로 한 칸 이동시킨다. 아래 그림을 참고하자.
 * https://upload.acmicpc.net/259549ad-b275-48a1-91f7-197a7ce72a23/-/preview/
 * 입력으로 킹이 어떻게 움직여야 하는지 주어진다.
 * 입력으로 주어진 대로 움직여서 킹이나 돌이 체스판 밖으로 나갈 경우에는 그 이동은 건너 뛰고 다음 이동을 한다.
 * 킹과 돌의 마지막 위치를 구하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 킹의 위치, 돌의 위치, 움직이는 횟수 N이 주어진다.
 * 둘째 줄부터 N개의 줄에는 킹이 어떻게 움직여야 하는지 주어진다.
 * N은 50보다 작거나 같은 자연수이고, 움직이는 정보는 위에 쓰여 있는 8가지 중 하나이다.
 *
 * @출력
 * 첫째 줄에 킹의 마지막 위치, 둘째 줄에 돌의 마지막 위치를 출력한다.
 **/

class S_1063 {
    fun solution() = with(System.`in`.bufferedReader()){
        val kingPositionList = mutableListOf<Char>()
        val stonePositionList = mutableListOf<Char>()
        val (kingPosition, stonePosition, n) = readLine().split(" ")
        kingPositionList.add(kingPosition[0])
        kingPositionList.add(kingPosition[1])
        stonePositionList.add(stonePosition[0])
        stonePositionList.add(stonePosition[1])
        for (i in 0 until n.toInt()){
            check(readLine(), kingPositionList, stonePositionList)
        }
    }

    private fun check(str: String, king: MutableList<Char>, stone: MutableList<Char>){
        when(str.length){
            1 ->{
//                move(king, stone, )
            }
            2 ->{

            }
        }
    }

    private fun move(king: MutableList<Char>, stone: MutableList<Char>, str: Char){

    }
}

fun main() {
    val test = S_1063()
    test.solution()
}

        //"R" ->{
//                    // R : 한 칸 오른쪽으로
//                    if (kingPosition[0].code == 'H'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] + 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1])
//                        stonePositionList[0] = stonePositionList[0] + 1
//                }
//                "L" ->{
//                    // L : 한 칸 왼쪽으로
//                    if (kingPosition[0].code == 'A'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] - 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1])
//                        stonePositionList[0] = stonePositionList[0] - 1
//                }
//                "B" ->{
//                    // B : 한 칸 아래로
//                    if (kingPosition[1].code == '1'.code)
//                        continue
//                    kingPositionList[1] = kingPositionList[1] - 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1])
//                        stonePositionList[1] = stonePositionList[1] - 1
//                }
//                "T" ->{
//                    // T : 한 칸 위로
//                    if (kingPosition[1].code == '8'.code)
//                        continue
//                    kingPositionList[1] = kingPositionList[1] + 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1])
//                        stonePositionList[1] = stonePositionList[1] + 1
//                }
//                "RT" -> {
//                    // RT : 오른쪽 위 대각선으로
//                    if (kingPosition[0].code == 'H'.code && kingPosition[1].code == '8'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] + 1
//                    kingPositionList[1] = kingPositionList[1] + 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1]) {
//                        stonePositionList[0] = stonePositionList[0] + 1
//                        stonePositionList[1] = stonePositionList[1] + 1
//                    }
//                }
//                "LT" ->{
//                    // LT : 왼쪽 위 대각선으로
//                    if (kingPosition[0].code == 'A'.code && kingPosition[1].code == '8'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] - 1
//                    kingPositionList[1] = kingPositionList[1] + 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1]) {
//                        stonePositionList[0] = stonePositionList[0] - 1
//                        stonePositionList[1] = stonePositionList[1] + 1
//                    }
//                }
//                "RB" -> {
//                    // RB : 오른쪽 아래 대각선으로
//                    if (kingPosition[0].code == 'H'.code && kingPosition[1].code == '1'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] + 1
//                    kingPositionList[1] = kingPositionList[1] - 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1]) {
//                        stonePositionList[0] = stonePositionList[0] + 1
//                        stonePositionList[1] = stonePositionList[1] - 1
//                    }
//                }
//                "LB" -> {
//                    // LB : 왼쪽 아래 대각선으로
//                    if (kingPosition[0].code == 'A'.code && kingPosition[1].code == '1'.code)
//                        continue
//                    kingPositionList[0] = kingPositionList[0] - 1
//                    kingPositionList[1] = kingPositionList[1] - 1
//                    if (kingPositionList[0] == stonePositionList[0] && kingPositionList[1] == stonePositionList[1]) {
//                        stonePositionList[0] = stonePositionList[0] - 1
//                        stonePositionList[1] = stonePositionList[1] - 1
//                    }
//                }
//            }
//        }
//        println("${kingPositionList[0]}${kingPositionList[1]}")
//        println("${stonePositionList[0]}${stonePositionList[1]}")