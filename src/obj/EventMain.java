package obj;

public class EventMain {

	public static void main(String[] args) {
		Event e = new Event("第308回KIS持ち物抜き打ちチェック");

		e.add(new Sankasha("田中",30));
		e.add(new Sankasha("山田",25));
		e.add(new Sankasha("山本",35));

		e.show();




	}

}
