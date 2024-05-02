package org.example


fun main() {
    var Zealot = Zealot()
    var Zergling =Zergling()
    var Marin =Marin()

    var JimRaynor = Marin("JimRaynor","unique",200,19,3)
    var Fenix = Zealot("Fenix","unique",480,22,3)
    var DevouringOne = Zergling("DevouringOne","unique",120,10,4)

    Marin().steampack("steampack 사용으로 hp가 10 마이너스 됬습니다.")



}

class Zealot(
    var name: String = "Zealot",
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
    var name: String = "Zergling",
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
    var name: String = "Marin",
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

    fun steampack(steampack: String): Int {
        println("$steampack")
        return hp - 10
    }

    fun info() {
        println("저의 이름은 ${name} 입니다")
        println("제 등급은 ${grade} 입니다.")
        println("제 hp는 ${hp} 입니다.")
        println("제 Atk는 ${Atk} 입니다.")
        println("제 Armor는 ${Armor} 입니다.")
    }
}



