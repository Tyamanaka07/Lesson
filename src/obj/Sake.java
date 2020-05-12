package obj;

public class Sake extends Drink{
	double alc = 0;

	public Sake(String name, int amo, double alc) {
		super(name, amo);
		this.alc = alc;
	}


	public void show() {
		System.out.println(super.getName() + "：  " + super.getAmount() + "ml " + " 度数は" + alc);
	}
}
