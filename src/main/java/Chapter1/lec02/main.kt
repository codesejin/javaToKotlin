package Chapter1.lec02

fun main() {

    val str: String? = "ABC";
    //println(str.length) // 컴파일 에러 발생
    println(str?.length) // Safe Call 사용
    // null이 아니면 메소드 호출, null이면 null 반환

    // Elvis Operator (앞의 연산 결과가 null이면 뒤의 값을 사용)
    println(str?.length ?: 0) // null이면 0 반환
}

/**
 * Kotlin애서는 null이 가능한 타입을 완전히 다르게 취급한다
 **/

// null을 반환하지 않기 때문에 반환타입에 물음표 없음
fun startsWithA1(str: String?): Boolean {
    if(str == null) {
        throw IllegalArgumentException("null이 들어올 수 없습니다.")
    }
    return str.startsWith("A");
}

fun startsWithA1V2(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어올 수 없습니다.")
}

// null을 반환하기 때문에 반환타입에 물음표 있음
fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2V2(str: String?): Boolean? {
    return str?.startsWith("A")
}

// null일 수 있는 변수에서는 바로 메소드 호출이 불가능하다.
// 코틀린은 문맥상 위에서 null을 한번 체크해주면 그 아래에서는 null을 체크하지 않아도 된다.
fun startsWithA3(str: String?): Boolean {
    if(str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3V2(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}


/**
 * 그렇다면 null이 가능한 타입만을 위한 기능은 없나?!
 * -> Safe Call
 * main 메소드 내부에서 확인
 **/

/**
 * Null type 단언문
 * 혹시나 null이 들어오면 NPE가 나오기 때문에
 * 정말 null이 아닌게 확실한 경우에만 널 아님 단언!! 을 사용해야 한다.
 **/
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}