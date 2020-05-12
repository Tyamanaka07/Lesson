package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		Sword s = new Sword("炎の剣", 10);


		Hero h1= new Hero("YSKMM");
		Hero h2 = new Hero("山田");

//		Hero.money = 500;

		System.out.println(Hero.money);


//		h1.setName("田中");
//		h1.setSword(s);
//
//		System.out.println("勇者" + h1.getName() + "を生み出しました。");
//		System.out.println("現在の武器は" + h1.getSword().getName() + "です");
//
//
//		h1.setHp(-100);
//		System.out.println(h1.getHp());


//		Wizard w = new Wizard();
//		w.name = "スガワラ";
//		w.hp = 50;
//		w.heal(h1);
//
//
//		Hero h2 = new Hero("YSKMM");
//		h2 = h1;
//		System.out.println(h1.hp);
//
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m2.hp = 50;
//		m2.suffix = 'B';
//
//		h1.attack(m1);
//
//		h1.slip();
//		m1.run();
//		m2.run();
//		h1.run();

	}

}
