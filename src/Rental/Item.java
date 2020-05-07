package Rental;

public abstract class Item {
	String name;
	int days;

	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	public abstract int getPrice();

	@Override
	public String toString() {
		return "商品名：" + name + "  日数：" + days + "  料金：" + getPrice() + "円";
	}

}
