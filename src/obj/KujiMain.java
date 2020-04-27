package obj;

public class KujiMain {

	public static void main(String[] args) {
		Kuji kuji1 = new Kuji();
		Kuji kuji2 = new Kuji();
		Kuji kuji3 = new Kuji();

		KujiChecker kujicheck = new KujiChecker();

		kuji1.number = 123456;
		kuji2.number = 865420;
		kuji3.number = 967412;

		kujicheck.check(kuji1);
		kuji1.show();
		System.out.println("金額は" + kujicheck.kingaku + "円");

		kujicheck.check(kuji2);
		kuji2.show();
		System.out.println("金額は" + kujicheck.kingaku + "円");

		kujicheck.check(kuji3);
		kuji3.show();
		System.out.println("金額は" + kujicheck.kingaku + "円");




	}

}
