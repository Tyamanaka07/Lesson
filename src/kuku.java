
public class kuku {

	public static void main(String[] args) {
		System.out.println("九九の問題!!");

		int suti1 = new java.util.Random().nextInt(8);
		int suti2 = new java.util.Random().nextInt(8);

		System.out.print(suti1 + "*" + suti2 + "=" );

		int you_answer = new java.util.Scanner(System.in).nextInt();
		int answer = suti1 * suti2;

		if(answer == you_answer) {
			System.out.println("正解!!");
		}
		else {
			System.out.println("間違い。正解は" + answer);
		}
	}

}