package Chapter1.lec02

fun main() {
    val person = Person("홍길동")
    startsWith(person.name)
}

fun startsWith(str: String): Boolean{
    return str.startsWith("A")
}