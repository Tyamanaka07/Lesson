package Rental;

public class RentalMain {

	public static void main(String[] args) {
		Rental re = new Rental();
//		ArrayList<Item> item = new ArrayList<Item>();


		re.add(new Book("ワンピース", 7));
		re.add(new CD("パプリカ", 3));
		re.add(new CD("Lemon", 1));

//		item.add(new Book("ワンピース",7));
//		item.add(new CD("パプリカ",3));
//		item.add(new CD("Lemon",1));


		re.show();
		System.out.println("合計" + re.getGoukei() + "円");

//		int sum = 0;
//
//		for(Item i : re.list) {
//			System.out.println(i);
//			sum += i.getPrice();
//		}
//		System.out.println("合計" + sum + "円");

	}

}
