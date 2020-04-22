
public class IfSmaple {

	public static void main(String[] args) {
		System.out.print("数値を入力してください：");
		int suti = new java.util.Scanner(System.in).nextInt();
		
		if(suti == 10) {
			System.out.println("あたり");
		}
		else {
			System.out.println("はずれ");
		}

	}

}
