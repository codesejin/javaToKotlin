package Chapter1.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
	String name;
	Person(String name) {
		this.name = name;
	}

	/**
	 * 코틀린에서 자바 코드를 가져다 쓸때
	 * @Nullable, @NotNull을 사용하면 좋다.
	 **/
	// @Nullable 로 선언하면 null을 반환할 수 있다.
	@NotNull
	public String getName() {
		return name;
	}
}