package Sukkiri;

public class Wizard {
	String name;
	int hp;

	public void heal(Hero h) {
		//h.hp += 10;
		h.setHp(h.getHp() + 10);

		System.out.println(h.getName() +"のHPを10回復した。");
	}
}
