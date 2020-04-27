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
		kujicheck.check(kuji2);
		kujicheck.check(kuji3);

		kuji1.show();
		kuji2.show();
		kuji3.show();



	}

}
