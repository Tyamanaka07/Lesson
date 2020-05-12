package obj;

public class Sankaku implements Zukei{
	private int teihen;
	private int high;

	public Sankaku(int teihen, int high) {
		this.teihen = teihen;
		this.high = high;
	}



	public int getTeihen() {
		return teihen;
	}



	public void setTeihen(int teihen) {
		this.teihen = teihen;
	}



	public int getHigh() {
		return high;
	}



	public void setHigh(int high) {
		this.high = high;
	}



	public void menseki() {
		System.out.println("面積は" + teihen * high / 2 + "です");
	}

	@Override
	public String toString() {
		return "底辺 =" + teihen + ", 高さ =" + high;
	}



}
