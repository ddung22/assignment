package org.example


fun main() {
    println("나는 짐레이너 입니다.")
    Marin().info()
}

class Zealot(
    var grade: String = "Normal",
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

    fun info() {
        println("저는 Zealot 입니다")
        println("제 등급은 ${grade} 입니다.")
        println("제 hp는 ${hp} 입니다.")
        println("제 Atk는 ${Atk} 입니다.")
        println("제 Armor는 ${Armor} 입니다.")
    }
}

class Zergling(
    var grade: String = "Normal",
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

    fun info() {
        println("저는 Zergling 입니다")
        println("제 등급은 ${grade} 입니다.")
        println("제 hp는 ${hp} 입니다.")
        println("제 Atk는 ${Atk} 입니다.")
        println("제 Armor는 ${Armor} 입니다.")
    }
}

class Marin(
    var name: String = readLine().toString(),
    var grade: String = "Normal",
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
        println("저의 이름은 ${name} 입니다")
        println("제 등급은 ${grade} 입니다.")
        println("제 hp는 ${hp} 입니다.")
        println("제 Atk는 ${Atk} 입니다.")
        println("제 Armor는 ${Armor} 입니다.")
    }
}


