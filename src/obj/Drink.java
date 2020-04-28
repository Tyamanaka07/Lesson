package obj;

public class Drink {
	String name;
	int amount;

	public Drink(String name, int amo) {
		this.name = name;
		this.amount = amo;
	}

	public void show() {
		System.out.println(name + "： " + amount + "ml");
	}
}
