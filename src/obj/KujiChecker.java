package obj;

public class KujiChecker {
	int kingaku;

	public void check(Kuji k) {
		if(k.number == 123456) {
			k.result = "1等";
			this.kingaku = 100000;
		}
		else if(k.number % 100 ==12){
			k.result = "2等";
			this.kingaku = 1000;
		}
		else {
			k.result = "はずれ";
		}

	}
}
