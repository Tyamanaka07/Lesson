package keisho;
import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {

		ArrayList<KukuMondai> nArray = new ArrayList<KukuMondai>();
		nArray.add(new KukuMondai());
		nArray.add(new KukuMondai());
		nArray.add(new KukuMondai());
		nArray.add(new KukuMondai());
		nArray.add(new KukuMondai());

		for(KukuMondai n : nArray) {

			n.show();
			int i = new java.util.Scanner(System.in).nextInt();
			n.check(i);
		}

	}

}
