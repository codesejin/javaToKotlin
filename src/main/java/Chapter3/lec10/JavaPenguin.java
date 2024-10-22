package Chapter3.lec10;

public final class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimmable {

	private final int wingCount;

	public JavaPenguin(String species) {
		super(species, 2);
		this.wingCount = 2;
	}

	@Override
	public void move() {
		System.out.println("펭귄이 움직입니다~ 꿱꿱");

	}

	@Override
	public int getLegCount() {
		return super.legCount + this.getLegCount();
	}

	@Override
	public void act() {
		JavaSwimmable.super.act();
		JavaFlyable.super.act();
	}
}
