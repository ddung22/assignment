package org.example

fun main() {
    val game = NumberBaseballGame()
    val gamerule = Rule()
    gamerule.rule()
    game.start()
}

class Rule() {
    fun rule() {
        println("먼저 게임 룰에 대해서 알려드리겠습니다. 랜덤으로 서로다른 숫자 3개를 생성하면 플레이어가 숫자를 맞추는 게임입니다.")
        println("생성한 숫자 3자리 내에서 플레이어가 선택한 숫자가 하나 포함되면 1 ball 2개 포함되면 2ball 3개 포함되면 3ball 입니다.")
        println("이때 플레이어가 입력한 숫자와 랜덤으로 생성한 숫자와 위치와 값이 한 자리 일치할시 1strike 두 자리 일치할시 2strike 세 자리 일치할시 3strike 플레이어가 이기게 됩니다.")
        println("지금부터 숫자야구 게임을 시작합니다")

        println("3자리 랜덤 번호가 생성 되었습니다.")
    }
}

class NumberBaseballGame() {
    val RandomNumbers = CreateNumbers()

    fun start() {
        while (true) {
            print("세 자리 숫자를 입력하세요 ")
            val Input = readLine()?.toIntOrNull()

            if (Input == null || Input !in 100..999) {
                println("올바른 입력이 아닙니다. 세 자리 숫자를 입력해주세요.")
                continue
            }

            val (strike, ball) = countStrikeBall(Input)
            println("$strike Strike, $ball Ball")

            if (strike == 3) {
                println("축하합니다! 정답을 맞추셨습니다.")
                break
            }
        }
    }

    fun CreateNumbers(): List<Int> {
        val InputNumbers = mutableListOf<Int>()

        while (InputNumbers.size < 3) {
            val randomNumber = (1..9).random()
            if (randomNumber !in InputNumbers) {
                InputNumbers.add(randomNumber)
            }
        }

        return InputNumbers
    }

    fun countStrikeBall(input: Int): Pair<Int, Int> {
        var strike = 0
        var ball = 0
        val inputDigits = input.toString().toList()
        val answerDigits = RandomNumbers.joinToString("").toList()

        for ((index, digit) in inputDigits.withIndex()) {
            if (digit == answerDigits[index]) {
                strike++
            } else if (digit in answerDigits) {
                ball++
            }
        }

        return strike to ball
    }
}