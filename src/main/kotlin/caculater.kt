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
    println("숫자 2개를 하나씩 입력 해주세요")
    val caculater = caculater()
    caculater.add()
    caculater.mynus()
    caculater.gob()
    caculater.nanu()
}
class caculater {
        var num1 : Double = readLine()!!.toDouble()
        var num2 : Double = readLine()!!.toDouble()
        fun add(){
         println("${num1+num2}")
        }
        fun mynus(){
            println("${num1-num2}")
        }
        fun gob(){
        println("${num1*num2}")
    }
        fun nanu(){
        println("${num1/num2}")
    }
}