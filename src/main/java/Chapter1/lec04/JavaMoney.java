package Chapter1.lec04;

import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {

	private final long amount;

	public JavaMoney(long amount) {
		this.amount = amount;
	}

	public JavaMoney plus(JavaMoney added) {
		return new JavaMoney(this.amount + added.amount);
	}

	@Override
	public int compareTo(JavaMoney o) {
		// 주어진게 더 작으면 양수, 같으면 0, 더 크면 음수
		return Long.compare(amount, o.amount);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof JavaMoney javaMoney))
			return false;
		return amount == javaMoney.amount;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(amount);
	}

	@Override
	public String toString() {
		return "JavaMoney{" +
			"amount=" + amount +
			'}';
	}
}
