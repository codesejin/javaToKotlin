package Chapter3.lec09

import Chapter3.lec09.images.JavaPerson

fun main() {
    val person = Person("박세진", 27)
    println(person.name) // getter
    person.age = 10 // setter
    println(person.age) // getter

    val person2 = JavaPerson("박세진", 27)
    println(person2.name) // getter
    person2.age = 10 // setter
    println(person2.age) // getter

    val person3 = Person("박세진")

    val person4 = Person()
}

/**
 * 개명이 불가능한 나라에 사는 Person 클래스
 **/
class Person(
    // default parameter
    //name: String = "홍길동", // val name을 생성자안에 선언하면 프로퍼티라서 getter를 자동으로 만들어준다 -> 자동으로 만들지 않으려면 val 빼기
    name: String = "홍길동",
    var age: Int = 1,
) {

    var name: String = name
        set(value) {
            field = value.uppercase()
        }
    //name이 바깥에서 호출될때 무조건 대문자로 바꿔주기
//    val name: String = name
//        get() = field.uppercase()

    // 클래스가 호출되는 시점에 한 번 호출 됨
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자 호출")
    }
    constructor(): this("홍길동") {
        println("두 번째 부생성자 호출")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // custom getter
    // 함수 대신 프로퍼티로 만들 수 있다
    val isAdult: Boolean
        get() = this.age >= 20
}