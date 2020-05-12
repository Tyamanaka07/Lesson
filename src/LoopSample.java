
public class LoopSample {

	public static void main(String[] args) {
		
//		while(true){
//			int num = new java.util.Scanner(System.in).nextInt();
//			if(num==0) {
//				break;
//			}
//			System.out.println(2*num);
//		}
		
//		for(int i = 1; i <= 10; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		for(int i=1; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.print(i*j);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}

		System.out.print("数を入力してください：");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++){
			System.out.print(i + ",");
		}
	}

}
