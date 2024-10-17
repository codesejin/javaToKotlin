package Chapter1.lec01

fun main () {
    // 가변 변수(발..)
    var number1 = 10L
    // 위의 코드와 동일 var number1: Long = 10L

    // 불변 변수(밸..)
    val number2 = 10L
    // 위의 코드와 동일 val number2: Long = 10L

    // 변수의 타입을 명시적으로 지정하지 않아도 자동으로 타입을 추론

    // 초기값을 지정해주지 않는 경우 컴파일 에러 발생
    var number : Int
    //println(a) // 컴파일 에러 발생, Variable 'a' must be initialized

    val list = arrayListOf(1, 2, 3, 4, 5)
    list.add(6)  // 정상 작동

    // 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.

    // 코틀린에서 null을 허용하려면 변수 타입에 ?를 붙여야 한다.
    var nullable : String? = null
    var nullLong : Long? = null

    // 객체 인스턴스화 할때 new 키워드 없이 객체 생성
    var person = Person("홍길동");
}