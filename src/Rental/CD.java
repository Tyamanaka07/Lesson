package Rental;

public class CD extends Item{

	public CD(String name, int days) {
		super(name,days);
	}

	@Override
	public int getPrice() {
		return 200 + 100 * days;
	}

}
