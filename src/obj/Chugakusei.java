package obj;

public class Chugakusei extends Seito{
	int eigo;

	public Chugakusei(String name, int kokugo, int sansu, int shakai, int eigo) {
		super(name,kokugo,sansu,shakai);
		this.eigo = eigo;
	}
	public void show() {
		super.show();
		System.out.println(" 英語" + this.eigo + "点");
	}
	public int goukei() {
		return super.goukei() + this.eigo;

	}

}
