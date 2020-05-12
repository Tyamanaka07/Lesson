package obj;

public class EventMain {

	public static void main(String[] args) {
		Event ex = new Event("第308回KIS持ち物抜き打ちチェック");
		
		try {
			ex.add(new Sankasha("",23));
			ex.add(new Sankasha("山田",25));
			ex.add(new Sankasha("山本",35));
		}
		catch(SankashaException e) {
			System.out.println("エラー：" + e.getMessage());
		}
		ex.show();

}
