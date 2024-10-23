package Chapter3.lec11

val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

// 원래는 public constructor가 생략되어있다.
// 다른 접근 지시어를 쓰고 싶다면 constructor 키워드를 써야한다.
class Cat private constructor()

open class Dog protected constructor()

/**
 * 접근 지시어가 없을 경우,<br>
 * name, owner, price에 대한 3개의 getter와 owner와 price에 대한 setter가 있다.<br>
 * why? val은 불변변수에 사용하기 때문에 setter가 없다.
 */
class Car(
    internal val name: String, // name에 대한 getter를 Internal로 설정
    private var owner: String, // owener에 대한 getter와 setter를 private로 설정
    _price: Int
) {
    var price = _price // price 에 대한 setter에만 private을 붙이고 싶다
        private set
}