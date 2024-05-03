# 코틀린 2-2과제

## (숫자야구 만들기)

<br>

## 과제 내용 (요구사항)

## - 필수 구현 기능

## - 입력

    - 서로 다른 3자리수
    - 게임 시작, 기록 보기, 종료를 구분하는 수 입력
    - 필수 구현에서는 실행 시, 바로 게임 시작
    - 선택 구현에서 시작, 기록, 종료 구분

## - 출력

    - 입력한 수에 대한 결과값을 “볼, 스트라이크, Nothing”으로 표시

## - 요구사항

    - 1에서 9까지의 서로 다른 임의의 수 3개를 정하고 맞추는 게임입니다
    - 정답은 랜덤으로 만듭니다.(1에서 9까지의 서로 다른 임의의 수 3자리)
    - 정답을 맞추기 위해 3자리수를 입력하고 힌트를 받습니다
    - 힌트는 야구용어인 볼과 스트라이크입니다.

    - 같은 자리에 같은 숫자가 있는 경우 스트라이크, 다른 자리에 숫자가 있는 경우 볼입니다.
    
    - ex) 정답 : 456 인 경우
    - 435를 입력한 경우 → 1스트라이크 1볼
    - 357를 입력한 경우 → 1스트라이크
    - 678를 입력한 경우 → 1볼
    - 123를 입력한 경우 → Nothing
    - 만약 올바르지 않은 입력값에 대해서는 오류 문구를 보여주세요.
    - 3자리 숫자가 정답과 같은 경우 게임이 종료됩니다.   

## 선택 구현 기능

### 1번

    - 프로그램을 시작할 때 안내문구를 보여주세요.
    - 1번 게임 시작하기의 경우 “필수 구현 기능” 의 예시처럼 게임이 진행됩니다
    - 정답을 맞혀 게임이 종료된 경우 위 안내문구를 다시 보여주세요
       
    // 예시
        환영합니다! 원하시는 번호를 입력해주세요
        1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
        1 // 1번 게임 시작하기 입력

        < 게임을 시작합니다 >
        숫자를 입력하세요

### 2번

    -정답이 되는 숫자를 0에서 9까지의 서로 다른 3자리의 숫자로 바꿔주세요
    
    맨 앞자리에 0이 오는 것은 불가능합니다
    092 → 불가능
    870 → 가능
    300 → 불가능

### 3번

    -실행 시, 2번 게임 기록 보기의 경우 완료한 게임들에 대해 시도 횟수를 보여줍니다.
    
    // 예시
    환영합니다! 원하시는 번호를 입력해주세요
    1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
    
    // 2번 게임 기록 보기 입력

    < 게임 기록 보기 >
    1번째 게임 : 시도 횟수 - 14
    2번째 게임 : 시도 횟수 - 9
    3번째 게임 : 시도 횟수 - 12
    .
    .

### 4번

    - 실행 시, 3번 종료하기의 경우 프로그램이 종료됩니다.
    - 이전의 게임 기록들도 초기화됩니다.
    
    // 예시
    환영합니다! 원하시는 번호를 입력해주세요
    1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
    3 // 3번 종료하기 입력

    < 숫자 야구 게임을 종료합니다 >
    맨 앞자리에 0이 오는 것은 불가능합니다
    092 → 불가능
    870 → 가능
    300 → 불가능

    - 1, 2, 3 이외의 입력값에 대해서는 오류 메시지를 보여주세요
    
    // 예시
    환영합니다! 원하시는 번호를 입력해주세요
    1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
    4

    올바른 숫자를 입력해주세요!

>

## 필수구현 부분 코드

### 게임시작

```
fun main() {
    val game = NumberBaseballGame()
    val gamerule = Rule()
    gamerule.rule()
    game.start()
}
```

### 서로 다른  3자리수를 랜덤으로 생성

```
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
```

### 입력한 수에 대한 결과값을 힌트 표시해주는 부분

```
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
```
### 랜덤 숫자를 만드는 코드 부분
```
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
```

## 환경설정

+ Language : Kotiln
+ IDLE : IntelliJ community
+ JDK 버젼 temurin 18
