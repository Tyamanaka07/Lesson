
public class Coin {

	public static void main(String[] args) {
		int[] coins = {500, 100, 50, 10, 5, 1};
		int sum = 0;

		for(int num : coins) {
			int mai = inputMaisu(num);
			sum = sum + (num * mai);
		}
		System.out.println("合計金額は" + sum + "円です");
	}
	
	public static int inputMaisu(int num) {
		System.out.println(num + "円玉は何枚？");
		int maisu= new java.util.Scanner(System.in).nextInt();
		return maisu;
	}

}
