package obj;

public class Hizuke {
	int tuki;
	int hi;


	public Hizuke(int tuki, int hi) {
		this.hi = hi;
		this.tuki = tuki;
	}

	public void show() {
		if(tuki <= 0 || tuki >=13) {
			System.out.println("そんな月はありません^^");
		}
		else {
		System.out.print(tuki + "月" + hi + "日");
		}
	}
}
