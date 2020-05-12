package obj;

public class ShikenMain {

	public static void main(String[] args) {
		ItPassport ip = new ItPassport("ITパスポート", 90);
		
		ip.show();
		
		Kihon kihon = new Kihon("基本情報技術者試験", 10,80);
		
		kihon.show();
	}

}
