package Chapter2.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }

    // score라는 값이 0부터 100사이에 있지 않으면
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100입니다")
    }
    // score라는 값이 0부터 100사이에 있으면
    if (score in 0..100) {
        println("정상적인 값입니다")
    }
}

fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun getPassOrFail2(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else if (score >= 60) {
        return "D";
    } else {
        return "F";
    }
}

fun getGrade2(score: Int): String {
    return if (score >= 90) {
        "A";
    } else if (score >= 80) {
        "B";
    } else if (score >= 70) {
        "C";
    } else if (score >= 60) {
        "D";
    } else {
        "F";
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else ->  "F"
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}