package Chapter1.lec01;

import java.util.ArrayList;
import java.util.List;

public class Lec01Main {
	public static void main(String[] args) {
		long number1 = 10L; // (1)
		final long number2 = 10L; // (2)

		Long number3 = 1_000L; // (3)
		Person person = new Person("최태현"); // (4)

		// Collection은 final로 선언해도 내부의 데이터를 변경할 수 있다.
		final List<Integer> numbers = new ArrayList<>(); // (5)
		numbers.add(3);
	}
}
