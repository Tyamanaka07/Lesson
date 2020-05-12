package obj;

public class ItPassport extends Shiken{
	int tensu;

	public ItPassport(String name, int tensu) {
		super(name);
		this.tensu = tensu;
	}

	void showGoukaku() {
		if(this.tensu >= 70) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
	}
}
