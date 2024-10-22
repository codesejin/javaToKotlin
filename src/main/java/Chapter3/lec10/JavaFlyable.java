package Chapter3.lec10;

public interface JavaFlyable {

	default void act() {
		System.out.println("파닥 파닥");
	}
}
