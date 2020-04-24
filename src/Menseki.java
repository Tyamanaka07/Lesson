
public class Menseki {
	
	//1番
//	public static void main(String[] args) {
//		enMenseki(10);
//	}
//	
	public static void enMenseki(int hankei) {
		System.out.println("この円の面積は" + hankei * hankei * 3.14 + "です");
	}

	
	//2番
	public static void main(String[] args) {
		System.out.println("半径1から5の円の面積を表示します");
		for(int i=1; i<=5; i++) {
			enMenseki(i);
		}
	}
	//1番のenMensekiメソッドを使用するため省略
	
	
	//3番
//	public static void main(String[] args) {
//		System.out.println("半径3, 8, 20の面積をそれぞれ表示します");
//		int[] hankei = {3, 8, 20};
//		for(int h : hankei) {
//			enMenseki(h);
//		}
//	}
}
