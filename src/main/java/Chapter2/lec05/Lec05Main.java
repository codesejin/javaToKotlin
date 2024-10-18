package Chapter2.lec05;

public class Lec05Main {
	public static void main(String[] args) {
	}

	private void validateScoreIsNotNegative(int score) {
		if (score < 0) {
			throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
		}
	}

	private String getPassOrFail(int score) {
		if (score >= 50) {
			return "P";
		} else {
			return "F";
		}
	}

	private String getPassOrFail2(int score) {
		return score >= 50 ? "P" : "F";
	}

	private String getGrade(int score) {
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
}
