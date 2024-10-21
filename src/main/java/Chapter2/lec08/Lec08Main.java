package Chapter2.lec08;

public class Lec08Main {
	public static void main(String[] args) {

		String[] array = new String[]{"A","B","C"};
		printAll(array);

		printAll("A","B","C");
	}
	public static void repeat(String str, int num, boolean useNewLine) {
		for (int i = 1; i <= num; i++) {
			if (useNewLine) {
				System.out.println(str);
			} else {
				System.out.print(str);
			}
		}
	}
	// 이미 많은 코드에서 useNewLine을 true로 사용하고 있는 경우, 이 함수를 사용하는 입장에서는 귀찮음
	// 오버로딩을 활용하면 된다
	public void repeat(String str, int num) {
		repeat(str, num, true);
	}

	// 이미 많은 코드에서 출력을 3번씩 하고 있다면, 이 함수를 사용하는 입장에서는 귀찮음
	// 오버로딩을 활용하면 된다
	public void repeat(String str) {
		repeat(str, 3, true);
	}

	public static void printAll(String... strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}
}
