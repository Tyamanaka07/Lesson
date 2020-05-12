package obj;

public class Shikaku implements Zukei{
	private int haba;
	private int takasa;

	public Shikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}



	public int getHaba() {
		return haba;
	}



	public void setHaba(int haba) {
		this.haba = haba;
	}



	public int getTakasa() {
		return takasa;
	}



	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}



	public void menseki() {
		System.out.println("面積は" + this.haba * this.takasa);
	}

	@Override
	public String toString() {
		return "幅 =" + haba + ", 高さ =" + takasa;
	}


}
