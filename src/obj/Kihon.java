package obj;

public class Kihon extends Shiken{
	int gozen;
	int gogo;

	public Kihon(String name, int gozen, int gogo) {
		super(name);
		this.gozen = gozen;
		this.gogo = gogo;
	}

	void showGoukaku() {
		if(gozen >= 60 && gogo >= 60) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
	}
}
