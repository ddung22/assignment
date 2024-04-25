package org.example

fun main() {

//    println("첫번째 숫자를 넣어주세요")
//    var num1 = readLine()!!.toDouble()
//    println("연산자를 넣어주세요")
//    var operator = readLine().toString()
//    println("2번째 숫자를 넣어주세요")
//    var num2 = readLine()!!.toDouble()
//
//    println(
//        when (operator) {
//            "+" -> num1 + num2
//            "-" -> num1 - num2
//            "*" -> num1 * num2
//            "/" -> num1 / num2
//            "%" -> num1 % num2
//            else -> "잘못된 계산 입니다."
//        }
//        //연산자 "" 큰따움표 블럭으로 지정
//    )

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

class caculater {
    var num1: Double = 0.0
    var op = String()
    var num2: Double = 0.0


    fun add(): String {
        return "${num1 + num2}"
    }

    fun mynus(): String {
        return "${num1 - num2}"
    }

    fun gob(): String {
        return "${num1 * num2}"
    }

    fun nanu(): String {
        return "${num1 / num2}"
    }

    fun namuge(): String {
        return "${num1 % num2}"
    }
}


//{} 는 만들어내는 소스
//() 는 값을 넣어주는