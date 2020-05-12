
public class Loop2 {

	public static void main(String[] args) {
		//1番
		for(int i=0; i<5; i++) {
			System.out.print("こんにちは  ");
		}
		System.out.println("");
		
		
		//2番
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//3番
		System.out.print("数値を入力してください：");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i=0; i<=num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//4番
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");

		//5番
		for(int i=5; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//6番
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
