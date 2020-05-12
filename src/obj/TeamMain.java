package obj;
class Player{
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}




public class TeamMain {

	public static void main(String[] args) {
		Team t = new Team("ロアッソ熊本",5,2);
		Team t2 = new Team();

		System.out.println(t.getName() + " " + t.getWin() + "勝 " + t.getLose() + "敗");
	}

}
