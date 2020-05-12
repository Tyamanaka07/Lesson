package obj;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
			names.add("たなか");
			names.add("すずき");
			names.add("さいとう");

		//System.out.println(names.get(1));


		for(String str : names) {
			System.out.println(str);
		}

		ArrayList<Sankaku> slist = new ArrayList<Sankaku>();

		slist.add(new Sankaku(10,5));
		slist.add(new Sankaku(5,8));
		slist.add(new Sankaku(20,10));


		for(Sankaku s : slist) {
			s.menseki();
		}

		List<Integer> ilist = new ArrayList<>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		ilist.set(0, 50);
		System.out.println(ilist.get(2));
		System.out.println(ilist.size());
		ilist.remove(1);
		for(int n : ilist) {
			System.out.println(n);
		}

		List<String> llist = new LinkedList<>();
		llist.add("abc");
		llist.add("def");
		llist.add("ghi");
		for(String s : llist) {
			System.out.println(s);
		}
	}

}
