package obj;

public class Uriage {
	int kosuu;
	Shouhin shouhin;

	public void show() {
		System.out.println(this.shouhin.name + "は" + this.kosuu + "個売れた");
	}
	
	public void showUriage() {
		int sum = 0;
		sum = (int)Math.floor((this.shouhin.price + this.shouhin.price * 0.1) * kosuu);
		System.out.println("合計" + sum + "円です");
	}
}
