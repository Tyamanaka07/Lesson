package obj;

public class Drink {
	private String name;
	private int amount;

	public Drink(String name, int amo) {
		this.name = name;
		this.amount = amo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public void show() {
		System.out.println(name + "： " + amount + "ml");
	}
}
