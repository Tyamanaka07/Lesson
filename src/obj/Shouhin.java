package obj;

public class Shouhin {
	String name;
	int price;


	public Shouhin(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void show() {
		System.out.println(this.name + "は" + this.price +"円");
	}

	public void showtax() {
		System.out.println("消費税は" + this.price * 0.1 + "円");

	}


}
