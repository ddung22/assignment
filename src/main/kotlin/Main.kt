package org.example

fun main() {

}

class zealot(
    var hp: Int = 100,
    var Atk: Int = 10,
    var Armor: Int = 2
) {
    fun walk() {}
    fun hit(): Int {
        return 10
    }

    fun test(test: String) {
        println("입력 값은 $test")
    }

    fun test2(test2: String): Int {
        println("입력 값은 $test2")
        return 10
    }
}

class Zergling(
    var hp: Int = 20,
    var Atk: Int = 5,
    var Armor: Int = 1
) {

    fun walk() {}
    fun hit(): Int {
        return 5
    }

    fun test(test: String) {
        println("입력 값은 $test")
    }

    fun test2(test2: String): Int {
        println("입력 값은 $test2")
        return 10
    }
}

class Marin(
    var hp: Int = 40,
    var Atk: Int = 6,
    var Armor: Int = 1
) {
    fun walk() {}
    fun hit(): Int {
        return 6
    }

    fun test(test: String) {
        println("입력 값은 $test")
    }

    fun test2(test2: String): Int {
        println("입력 값은 $test2")
        return 10
    }

    fun info() {


    }
}

