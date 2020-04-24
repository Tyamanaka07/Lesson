
public class Menseki {

	//enMensekiメソッド
	public static double enMenseki(int hankei) {
		return hankei*hankei*3.14;
	}
	
	public static int sankakuMenseki(int tei, int high) {
		return (tei * high) / 2;
	}


	//1番
	public static void main(String[] args) {
		int m = sankakuMenseki(11,5);
		System.out.println("この三角の面積は" + m + "㎡です");
	}



	//2番
//	public static void main(String[] args) {
//		System.out.println("半径1から5の円の面積を表示します");
//		for(int i=1; i<=5; i++) {
//			double m = enMenseki(i);
//		System.out.println("この円の面積は" + m + "です");
//		}
//	}


	//3番
//	public static void main(String[] args) {
//		System.out.println("半径3, 8, 20の面積をそれぞれ表示します");
//		int[] hankei = {3, 8, 20};
//		for(int h : hankei) {
//			double m = enMenseki(h);
//			System.out.println("この円の面積は" + m + "です");
//		}
//	}

}
