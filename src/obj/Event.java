package obj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {
	private String name;
	Date d = new Date();

	ArrayList<Sankasha> sanka = new ArrayList<Sankasha>();

	public Event(String name) {
		this.name = name;
	}

	public void add(Sankasha s) {
		sanka.add(s);
	}

	public void show() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		String s = f.format(d.getTime());

		System.out.println(this.name + "\n" + s);
		for(Sankasha list : sanka) {
		System.out.println(list.getName() + list.getAge() + "歳");
		}
	}
}
