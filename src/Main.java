public class Main {
	public static void main(String[] args) {
		int a;
		int b;
		a = 20;
		b = a + 5;
		int num = 10;
		int amari = num%3;

		System.out.println(a);
		System.out.println(b);
		System.out.println("今日は\"四月\"です");
		System.out.println("田尻さんの本日の支払いは\"\\1000000\"だなも");
		System.out.println("C:\\に\"フォルダ\"を作成");

		System.out.println(amari);


		num += 5;
		num++;
		System.out.println(num);

		/*double d = 3;
		int n = (int)3.0;
		String s = "ベスト" + 3;*/


		int kokugo = 70;
		int sansu = 75;

		System.out.println((kokugo + sansu) / 2.0);



		int num1 = 3;
		int num2 = 5;
		System.out.println("足し算の結果は" + (num1 + num2) + "です");

		System.out.print("私は");
		System.out.print("やまなか");
		System.out.println("です");

		int m = Math.max(10, 20);
		System.out.println(m);
		String age = "31";
		int nAge = Integer.parseInt(age);
		System.out.println(nAge + 1);


		int r = new java.util.Random().nextInt(10);
		System.out.println(r);


		//サイコロ(1～6までのランダム)
		int saikoro = new java.util.Random().nextInt(5);
		System.out.print(saikoro + 1);






	}
}
