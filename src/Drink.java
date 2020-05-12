
public class Drink {

	public static void main(String[] args) {
		System.out.print("月を入力しください（1~12）：");
		int tuki = new java.util.Scanner(System.in).nextInt();

		switch(tuki) {
		case 2:
			System.out.println("29日までです");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日までです");
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12:
			System.out.println("31日までです。");
			break;

		default:
			System.out.println("1~12までの数値を入力してください");
			break;
		}


//		System.out.print("飲み物のナンバーを入力してください（1~3）：");
//
//		int drink_num = new java.util.Scanner(System.in).nextInt();
//		switch(drink_num) {
//
//		case 1:
//			System.out.println("コーラです。どうぞ");
//			break;
//		case 2:
//		case 4:
//			System.out.println("コーヒーです。どうぞ");
//			break;
//		case 3:
//			System.out.println("水です。どうぞ");
//			break;
//		default:
//			System.out.println("1~3の番号を入力してください");
//		}

	}

}
