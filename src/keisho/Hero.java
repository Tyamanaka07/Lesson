package keisho;

public class Hero extends Character{

	public Hero() {
		this.name = name;
		System.out.println("Heroのコンストラクタ");
	}

	@Override
	public void attack(Matango m) {

	}

	public String toString() {
		return "名前" + this.name;
	}
}
