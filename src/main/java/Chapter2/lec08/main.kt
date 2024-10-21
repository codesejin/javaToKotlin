package Chapter2.lec08

fun main() {
    repeat("Hello World")
    repeat("Hello World", useNewLine = false)
    printNameAndGender(name = "박세진", gender = "female")

    // named parameter are not allowed for non-kotlin functions
    //Lec08Main.repeat(str = "Hello Wo

    printAll("A", "B", "C", "D")

    val array = arrayOf("Hello", "World", "Kotlin")
    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun maxV2(a: Int, b: Int): Int {
    // if-else가 하나의 Expression
    return if (a > b) {
        a
    } else {
        b
    }
}

// Expression이기 때문에 중괄호를 없애고 =로 대체 가능
fun maxV3(a: Int, b: Int): Int =
    if (a > b) a else b


// 반환 타입을 생략할 수 있음 (타입 추론)
fun maxV4(a: Int, b: Int) = if (a > b) a else b


// default parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}