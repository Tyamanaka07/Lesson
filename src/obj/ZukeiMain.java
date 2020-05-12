package obj;
import java.util.ArrayList;

public class ZukeiMain {

	public static void main(String[] args) {
		

		ArrayList<Zukei> zukei = new ArrayList<Zukei>();

		zukei.add(new Shikaku(10,5));
		zukei.add(new En(10));
		zukei.add(new Sankaku(10,10));

		for(Zukei z : zukei) {
			//z.menseki();
			System.out.println(z);
			if(z instanceof En) {
				((En) z).enshu();
			}
		}
	}

}
