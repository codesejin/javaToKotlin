package Chapter1.lec03

class main1 {
    // 코틀린에서는 "선언된 기본값"을 보고 타입을 추론한다

    val number1 = 3 // Int
    val number2 = 3L // Long

    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    // 명시적인 형변환
    val number5 = 3
    val number6: Long = number1.toLong()

    // nullable 변수 : Safe Call 과 Elvis 연산자 사용
    val number7: Int? = 3
    val number8: Long = number7?.toLong() ?: 0L

}

fun main() {
    printAgeIfPerson2(null)

    val withoutIndex =
        """
        ABC
        123
        456
        
        """.trimIndent()
    println(withoutIndex)
}

fun printAgeIfPerson(obj: Any) {
    // is : java의 instanceof와 같은 역할
    if (obj is Person) {
        // as Person : java의 (Person)와 같은 역할 [생략 가능]
        // 스마트캐스트 : is로 타입을 검사한 후에는 자동으로 형변환이 된다.
        // 한 번 코틀린 컴파일러가 컨텍스트를 분석해가지고 타입을 추론하면 그 이후로는 타입을 명시하지 않아도 된다.
        // 즉, if안에 들어왔는데, if문 안에서 타입을 검사했으니까 obj는 Person이다. 그래서 obj.age를 사용할 수 있다.
        val person = obj as Person
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    // as? 의 의미 : obj가 Person이면 Person으로 형변환하고, 아니면 null을 반환한다.
    // 그러면 person의 내용을 호출할때 ?.을 사용해서 null이면 null로 반환한다.
    val person = obj as? Person
    println(person?.age)
}