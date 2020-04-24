
public class Gengo {

	public static void main(String[] args) {
		System.out.print("元号を数字で入力してください(1.昭和, 2.平成, 3.令和) ：");
		int gengou = new java.util.Scanner(System.in).nextInt();
		System.out.print("年を入力してください（平成30年なら「30」と入力） ：");
		int nen = new java.util.Scanner(System.in).nextInt();

		int s = getSeireki(gengou, nen);
		String g = getGengouName(gengou);
		System.out.println( g + nen + "年は西暦" + s + "年です");



	}

	public static int getSeireki(int gengou, int nen){
		switch(gengou){
			case 1:
				return 1926 + nen;
			case 2:
				return 1989 + nen;
			case 3:
				return 2019 + nen;
			default:
				System.out.println("正しい元号を入力してください");
				return 0;
		}
	}

	public static String getGengouName(int gengou) {
		switch(gengou){
		case 1:
			return "昭和";
		case 2:
			return "平成";
		case 3:
			return "令和";
		default:
			System.out.println("正しい元号を入力してください");
			return 0 + "";
		}
	}

}
