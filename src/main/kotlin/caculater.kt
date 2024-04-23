package org.example


fun main() {
    var num1 = readLine()!!.toInt()
    var operator = readLine().toString()
    var num2 = readLine()!!.toInt()

    if (operator == "+") {
        var sum = (num1 + num2)
        println("결과값 = $sum")
        // 덧셈일 때
        // oprator 부분이 " -> " 큰따움표로 변경해주어야 한다
    } else if (operator == "-") {
        var difference = (num1 - num2)
        println("결과값 = $difference")
        // 뺄셈일 때
    } else if (operator == "*") {
        var product = (num1 * num2)
        println("결과값 = $product")
        // 곱셈일 때
    } else if (operator == "/") {
        var quotient = (num1 / num2)
        println("결과값 = $quotient")

    } else {
        println("잘못된 연산자 입니다.")
    }
    // 잘못된 연산자 일 때
}
