package org.example

class Enemy(
    val name: String,  //늑대, 호랑이 , 곰이 될수 있다
) {
    val atackPoint : Int = 10
    var healthPoint : Int = 100

    fun takeAttak(damage:Int) {
        println("공격 받았다!")
        healthPoint -= damage
    }
}

fun main() {
    // 인스턴스를 만들어서 실체화
    // 매직션 원이라는 인스턴스를 만들어서 캐릭터 클래스를 지정해줌
    var magicianOne = Character()
    magicianOne.fireBall()
    // 매직션원.파이어볼() 이라고 캐릭터안에 있는 파이어볼 함수를 불러오는 과정
}

class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    fun fireBall() {
        println("파이어볼!")
    }

    fun compositing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}