package keisho;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {

		ArrayList<KukuMondai> nArray = new ArrayList<KukuMondai>();
		for(int j=0; j<5; j++) {
			nArray.add(new KukuMondai());
		}

		for(KukuMondai n : nArray) {

			try {
				n.show();
				int i = new java.util.Scanner(System.in).nextInt();
				n.check(i);
			}
			catch(InputMismatchException e) {
				System.out.println("数字を入力してください");

			}
		}

	}

}
