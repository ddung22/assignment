package org.example

fun main() {
    println("먼저 게임 룰에 대해서 알려드리겠습니다. 랜덤으로 서로다른 숫자 3개를 생성하면 플레이어가 숫자를 맞추는 게임입니다.")
    println("생성한 숫자 3자리 내에서 플레이어가 선택한 숫자가 하나 포함되면 1 ball 2개 포함되면 2ball 3개 포함되면 3ball 입니다.")
    println("이때 플레이어가 입력한 숫자와 랜덤으로 생성한 숫자와 위치와 값이 한 자리 일치할시 1strike 두 자리 일치할시 2strike 세 자리 일치할시 3strike 플레이어가 이기게 됩니다.")
    println("지금부터 숫자야구 게임을 시작합니다")

    println("랜덤 번호가 생성 되었습니다.")

    var count = 0
    val num = IntArray(9) //길이가 9인 정수 배열을 변수 설정

    while (true) {
        count++
        println("${count}번째 시도")
        val answer =

        if (answer == "3스트라이크") {
            println("축하합니다! 정답을 맞추셨습니다!")
            break
        }
    }
}