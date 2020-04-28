package obj;
import java.util.ArrayList;

public class KujiMain {

	public static void main(String[] args) {
		ArrayList<Kuji> kuji = new ArrayList<Kuji>();
		
		kuji.add(new Kuji(123456));
		kuji.add(new Kuji(865420));
		kuji.add(new Kuji(967412));

		KujiChecker kujicheck = new KujiChecker();
		
		for(Kuji k : kuji) {
			kujicheck.check(k);
			k.show();
			System.out.println("金額は" + kujicheck.kingaku + "円");
		}

	}

}
