package Chapter3.lec09.images;

/**
 * 개명이 불가능한 나라에 사는 Person 클래스
 **/
public class JavaPerson {
	private final String name;
	private int age;

	public JavaPerson(String name, int age) {
		if (age <= 0) {
			throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다",age));
		}
		this.name = name;
		this.age = age;
	}

	public JavaPerson(String name) {
		// 기존에 있던 생성자를 호출
		this(name, 1);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
