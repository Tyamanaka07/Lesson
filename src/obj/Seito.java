package obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int shakai;


	public void show() {
		System.out.println(this.name + "\n国語" + this.kokugo
				+ "点 算数" + this.sansu + "点 社会" + this.shakai +"点");
	}
	public int goukei() {
		return this.kokugo + this.sansu + this.shakai;
	}

	public double heikin() {
		return (this.kokugo + this.sansu + this.shakai) / 3.0;
	}
}
