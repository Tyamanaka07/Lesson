package obj;

public class En implements Zukei{
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

	@Override
	public String toString() {
		return "面積 =" + hankei * hankei * 3.14;
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof En) {
			En h = (En) o;
			if(this.hankei == (e.hankei)) {
				return true;
			}
		}
		return false;
	}
}
