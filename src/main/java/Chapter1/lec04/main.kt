package Chapter1.lec04

fun main() {

    // 비교 연산자
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(2_000L)

    if (money1 > money2) {
        print("Money1이 Money2보다 금액이 큽니다")
    }

    // 동일 동등 연산자
    val money11 = JavaMoney(2_000L)
    val money12 = money11
    val money13 = JavaMoney(2_000L)

    println(money11 === money12) // true
    println(money11 === money13) // false
    println(money11 == money13) // true

    // 2개 중 앞에 하나만 true여도 뒤에 것은 실행되지 않음
    if (fun1() || fun2()) {
        println("본문")
    }
    // 2개 중 앞에 하나만 false여도 뒤에 것은 실행되지 않음
    if (fun2() && fun1()) {
        println("본문")
    }

    // 연산자 오버로딩
    val money21 = Money(1_000L)
    val money22 = Money(2_000L)
    // 둘다 가능
    println(money21.plus(money22)) // Money(amount=3000
    println(money21 + money22) // Money(amount=3000)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}