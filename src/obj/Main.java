package obj;

public class Main {

	public static void main(String[] args) {





		//三角形の面積表示
//		Sankaku s1 = new Sankaku();

//		s1.menseki();
//		System.out.println("");
//
//
		//商品の名前と値段を表示
		Shouhin s2 = new Shouhin("りんご", 100);
		Shouhin s3 = new Shouhin("みかん",150);
		Uriage uriage = new Uriage();
		Uriage uriage2 = new Uriage();

		Book b = new Book("それから", 500, "夏目漱石");


		uriage.kosuu = 5;
		uriage.shouhin = b;

		uriage2.kosuu = 3;
		uriage2.shouhin = s3;

		s2.show();
		s2.showtax();
		uriage.show();
		uriage.showUriage();


		s3.show();
		s3.showtax();
		uriage2.show();
		uriage2.showUriage();


		System.out.println("");
//
//
//		//円の面積と円周を表示
//		En en = new En();
//
//		en.hankei = 5;
//
//		en.menseki();
//		en.enshu();
//		System.out.println("");
//
//
//		//電子マネー計算
//		DensiMoney densi = new DensiMoney();
//
//		densi.kingaku = 0;
//		densi.point = 0;
//
//		densi.charge(1000);
//		densi.buy(500);
//		densi.change();
//		System.out.println("");
//
//
//		//月日を表示
//		//tukihi...4月     tukihi2...5月
//		Hizuke tukihi = new Hizuke();
//		Hizuke tukihi2 = new Hizuke();
//
//
////		tukihi.tuki = 4;
////		tukihi.hi = 27;
////		tukihi2.tuki = 5;
////		tukihi2.hi = 7;
////
////		tukihi.show();
////		tukihi2.show();
//
//		Nichiji n = new Nichiji();
//
//		n.tuki = 4;
//		n.hi = 28;
//		n.hour = 13;
//		n.minute = 30;
//		n.show();
	}

}
