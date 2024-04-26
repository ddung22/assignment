# 코틀린 2주차 과제

## (계산기 만들기)

<br>

## 과제 내용 (요구사항)
```
-  ## Lv1
    - [ ]  더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들기
    - [ ]  생성한 클래스를 이용하여 연산을 진행하고 출력하기

- ## Lv2
    - [ ]  Lv1에서 만든 Calculator 클래스에 “나머지 연산”이 가능하도록 코드를 추가하고, 연산 진행 후 출력
    - [ ]  ex) 나머지 연산 예시 : 6을 3으로 나눈 나머지는 0 / 5를 3으로 나눈 나머지는 2

- ## Lv3
    - [ ]  아래 각각 클래스들을 만들고 클래스간의 관계를 고려하여 Calculator 클래스와 관계 맺기
        - [ ]  AddOperation(더하기)
        - [ ]  SubstractOperation(빼기)
        - [ ]  MultiplyOperation(곱하기)
        - [ ]  DivideOperation(나누기)
        - [ ]  관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경
    - [ ]  `HINT` : 매개변수로 클래스를 주고 받아 객체를 주입하는 것이 핵심!

  ### 선택 구현 기능

- ## Lv4
    - [ ]  아래 연산 클래스들을 AbstractOperation라는 클래스명으로 만들어 사용하여 추상 클래스로 정의하고 Calculator 클래스의 내부 코드를 변경합니다.
        - [ ]  AddOperation(더하기)
        - [ ]  SubtractOperation(빼기)
        - [ ]  MultiplyOperation(곱하기)
        - [ ]  DivideOperation(나누기)
    - [ ]  `HINT` : ‘상속’이라는 키워드로 찾아봅시다!
```
## 현재 구현단계
- lv2 까지 구현 완료
- 더하기, 빼기, 곱하기, 나누기, 나머지 계산가능
- lv3 각클래스 불러오는 단계 진행중

## 추후 개발(구현) 목표 
- lv 3 ,4 까지 구현
- 계산기 계산 끝난후 다시 처음으로 돌아가는 기능 

## 코드요약

+ ### 1 . 메인
```
  fun main() {
    println("첫번째 숫자를 넣어주세요")
    var num1 = readLine()!!.toDouble()
    println("(+,-,*,/,%) 중 하나를 넣어주세요")
    var op = readLine().toString()
    println("두번째 숫자를 넣어주세요")
    var num2 = readLine()!!.toDouble()
    
    val caculater = caculater()
    caculater.num1 = num1
    caculater.num2 = num2
    caculater.add()
    caculater.mynus()
    caculater.gob()
    caculater.nanu()
    caculater.namuge()

    println(
        when (op) {
            "+" -> caculater.add()
            "-" -> caculater.mynus()
            "*" -> caculater.gob()
            "/" -> caculater.nanu()
            "%" -> caculater.namuge()
            else -> "잘못된 계산입니다."
        }
    )
}
    
```

+ ### 2 . 클래스 (함수)
```
class caculater {
var num1: Double = 0.0
var op = String()
var num2: Double = 0.0

    fun add(): String {
        return "${num1 + num2}"
    
    fun mynus(): String {
        return "${num1 - num2}"
    }

    fun gob(): String {
        return "${num1 * num2}"
    }

    fun nanu(): String {
        return "${num1 / num2}"

    fun namuge(): String {
        return "${num1 % num2}"
    }
}
```

## 환경설정

+ Language : Kotiln
+ IDLE : IntelliJ community
+ JDK 버젼 temurin 18
