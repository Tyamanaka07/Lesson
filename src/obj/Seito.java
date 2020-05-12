package obj;

public class Seito {
	private String name;
	private int kokugo;
	private int sansu;
	private int shakai;

	public Seito(String name, int kokugo, int sansu, int shakai) {
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
		this.shakai = shakai;
	}


	public void show() {
		System.out.print(this.name + "\n国語" + this.kokugo
				+ "点 算数" + this.sansu + "点 社会" + this.shakai + "点");
	}
	public int goukei() {
		return this.kokugo + this.sansu + this.shakai;
	}

	public double heikin() {
		return (this.kokugo + this.sansu + this.shakai) / 3.0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKokugo() {
		return kokugo;
	}


	public void setKokugo(int kokugo) {
		this.kokugo = kokugo;
	}


	public int getSansu() {
		return sansu;
	}


	public void setSansu(int sansu) {
		this.sansu = sansu;
	}


	public int getShakai() {
		return shakai;
	}


	public void setShakai(int shakai) {
		this.shakai = shakai;
	}


}
