package keisho;

public class En {
	int hankei;
	
	public En(int hankei) {
		this.hankei = hankei;
	}

	public void menseki() {
		System.out.println("円の面積は" + hankei * hankei * 3.14 + "です");
	}
	
	public void enshu() {
		System.out.println("円の円周は" + Math.floor(2 * hankei * 3.14));
	}
}
