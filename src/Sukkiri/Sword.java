package Sukkiri;

public class Sword {
	private String name;
	private int damage;

	public Sword(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return this.name;
	}

	public int getDamage() {
		return this.damage;
	}
}
