package Chapter1.lec04;

public class Lec04Main {

	public static void main(String[] args) {
		JavaMoney money1 = new JavaMoney(2_000L);
		JavaMoney money2 = new JavaMoney(1_000L);

		if (money1.compareTo(money2) > 0) {
			System.out.println("Money1이 Money2보다 금액이 큽니다");
		}

		JavaMoney money11 = new JavaMoney(1_000L);
		JavaMoney money12 = money11;
		JavaMoney money13 = new JavaMoney(1_000L);

		System.out.println(money11 == money12); // true
		System.out.println(money11 == money13); // false

		// JavaMoney클래스에 equals(), hashCode() 메서드를 오버라이딩 할 경우
		System.out.println(money11.equals(money13)); // true


		// 연산자 오버로딩
		JavaMoney javaMoney1 = new JavaMoney(1_000L);
		JavaMoney javaMoney2 = new JavaMoney(2_000L);
		System.out.println(javaMoney1.plus(javaMoney2));
	}
}
