package Rental;

public class CD extends Item{

	public CD(String name, int days) {
		super(name,days);
	}

	@Override
	public int getPrice() {
		return 300 + 100 * (this.getDays()-1);
	}

}
