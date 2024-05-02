package org.example

fun main() {
    println("첫번째 숫자를 넣어주세요")
    var num1 = readLine()!!.toDouble()
    println("(+,-,*,/,%) 중 하나를 넣어주세요")
    var op = readLine().toString()
    println("두번째 숫자를 넣어주세요")
    var num2 = readLine()!!.toDouble()




    println(
        when (op) {
            "+" -> plus().add(num1, num2)
            "-" -> mynus().mynus(num1, num2)
            "*" -> gob().gob(num1, num2)
            "/" -> nanu().nanu(num1, num2)
            "%" -> namuge().namuge(num1, num2)
            else -> "잘못된 계산입니다."
        }
    )
}



class plus {
    fun add(num1: Double, num2: Double): Double {
        val add = num1 + num2
        return add
    }
}

class mynus {
    fun mynus(num1: Double, num2: Double): Double {
        val mynus = num1 - num2
        return mynus
    }
}

class gob {
    fun gob(num1: Double, num2: Double): Double {
        val gob = num1 * num2
        return gob
    }
}

class nanu {
    fun nanu(num1: Double, num2: Double): Double {
        val nanu = num1 / num2
        return nanu
    }
}

class namuge {
    fun namuge(num1: Double, num2: Double): Double {
        val namuge = num1 % num2
        return namuge
    }
}


//{} 는 만들어내는 소스
//() 는 값을 넣어주는

//
//    fun add(): String {
//        return "${num1 + num2}"
//    }
//
//    fun mynus(): String {
//        return "${num1 - num2}"
//    }
//
//    fun gob(): String {
//        return "${num1 * num2}"
//    }
//
//    fun nanu(): String {
//        return "${num1 / num2}"
//    }
//
//    fun namuge(): String {
//        return "${num1 % num2}"
//    }
//} 레벨2


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


//    val caculater = number()
//    caculater.number = Double
////    number.num2 = Double
////    number.op = String

//    Calculator.add()
//    Calculator.mynus()
//    Calculator.gob()
//    Calculator.nanu()
//    Calculator.namuge()
//(클래스) , (함수이름)