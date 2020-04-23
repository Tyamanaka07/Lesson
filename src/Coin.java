
public class Coin {

	public static void main(String[] args) {
		int[] coins = {500, 100, 50, 10, 5, 1};
		int sum = 0;
		
		for(int num : coins) {
			System.out.println(num + "は何枚？");
			int maisu = new java.util.Scanner(System.in).nextInt();
			sum = sum + (num * maisu);
		}
		System.out.println("合計金額は" + sum + "円です");
	}

}
