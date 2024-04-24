package org.example

fun main() {

    var isValidMenu = false
    var selectedMenu = 0

    while (isValidMenu == false) {
        try {
            selectedMenu = getMenuNumber()
            isValidMenu = true
        } catch (e: Exception) {
            isValidMenu = false
        }
    }


    when (selectedMenu) {
        1 -> startgame()
        2 -> cratecharacter()
        3 -> endgame()
    }
}

fun getMenuNumber(): Int {
    println("메뉴를 입력해주세요")
    println("1. 게임 시작하기")
    println("2. 캐릭터 추가 하기")
    println("3. 게임 끝내기")

    val userInput = readLine()!!.toInt()

    if (userInput < 1 || userInput > 3) {
        throw Exception("입력이 잘못되었습니다.")
    }

    return userInput
}

fun startgame() {
    println("게임이 시작되었습니다")
}

fun cratecharacter() {
    val characterlist: MutableList<Map<String, String>> = mutableListOf()

    var isNeedMoreCharacter = "Y"

    while (isNeedMoreCharacter == "Y") {
        println("추가할 캐릭터의 이름을 입력해주세요")
        val name = readLine() ?: ""

        println("추가할 캐릭터의 직업을 입력해주세요")
        val job = readLine() ?: ""

        val character = mapOf("name" to name, "job" to job)

        characterlist.add(character)

        println("사용자를 더 추가 하시겠습니까? (Y : 추가, N : 그만두기")

        isNeedMoreCharacter = readLine() ?: "N"

    }

    characterlist.forEach {
        println(it)
    }

}

fun endgame() {
    println("게임이 종료되었습니다")
}