package obj;

public class DensiMoney {
	private int kingaku = 0;
	private int point = 0;



	public int getKingaku() {
		return kingaku;
	}
	public int getPoint() {
		return point;
	}
	public void charge(int m) {
		this.kingaku += m;
		System.out.println("現在の残高は" + this.kingaku + "円です");
	}
	public void buy(int m) {
		if(this.kingaku >= m) {
			this.kingaku -= m;
			this.point  += m * 0.05;
			System.out.println(m + "円引き落とします");
			System.out.println("現在の残高は" + this.kingaku + "円です");
			System.out.println("現在のポイントは" + this.point + "ポイントです");
		}
		else {
		System.out.println("残額が足りません");
		}
		System.out.println("");
	}

	public void change() {
		System.out.println("ポイントを残高に足します");

		this.kingaku += this.point;
		this.point = 0;

		System.out.println("現在の残高は" + this.kingaku + "円です");
		System.out.println("現在のポイントは" + this.point + "ポイントです");
	}
}
