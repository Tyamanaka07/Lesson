package obj;
import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
		ArrayList<Drink> drink = new ArrayList<Drink>();
		
		drink.add(new Drink("コーラ", 500));
		drink.add(new Drink("サイダー", 1500));
		drink.add(new Drink("コーヒー", 350));
		
		int sum = 0;
		for(Drink d : drink) {
			sum += d.amount;
			d.show();
		}
		System.out.println("合計： " + sum + "ml");
		

	}

}
