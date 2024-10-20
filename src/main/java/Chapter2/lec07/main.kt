package Chapter2.lec07

fun parseIntOrThrow(str: String): Int {
    try {
        // 기본 타입간의 형변환은 toType()을 사용
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}