package org.example

fun main() {
    println("첫번째 숫자를 넣어주세요")
    var num1 = readLine()!!.toDouble()
    println("연산자를 넣어주세요")
    var operator = readLine().toString()
    println("2번째 숫자를 넣어주세요")
    var num2 = readLine()!!.toDouble()

    println(
        when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            "%" -> num1 % num2
            else -> "잘못된 계산 입니다."
        }
    )
}