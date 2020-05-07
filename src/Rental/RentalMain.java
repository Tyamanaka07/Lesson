package Rental;
import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {
		ArrayList<Item> item = new ArrayList<Item>();

		item.add(new Book("ワンピース",7));
		item.add(new CD("パプリカ",3));
		item.add(new CD("Lemon",1));
		
		int sum = 0;

		for(Item i : item) {
			System.out.println(i);
			sum += i.getPrice();
		}
		System.out.println("合計" + sum + "円");

	}

}
