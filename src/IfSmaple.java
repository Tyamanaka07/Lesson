
public class IfSmaple {

	public static void main(String[] args) {
		System.out.print("点数を入力してください：");
		int tensu = new java.util.Scanner(System.in).nextInt();

		
		if(tensu >= 80 ) {
			System.out.println("評価A!!");
		}
		else if(tensu >= 60 && tensu <= 79) {
			System.out.println("評価B!!");
		}
		else {
			System.out.println("評価C!!");
		}
		
	}

}
