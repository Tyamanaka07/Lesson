package DB;

import java.util.ArrayList;

public class UriageCheck {


	public static void main(String[] args) {
		ShouhinDAO sdao = new ShouhinDAO();

		ArrayList<Shouhin> slist = sdao.findAll();
		for(Shouhin s : slist) {
			System.out.println(s.getSid() + " : " + s.getSname());
		}
		System.out.println("どの商品を見たいですか？");
		int sid = new java.util.Scanner(System.in).nextInt();


		UriageDAO udao = new UriageDAO();

		ArrayList<Uriage> ulist = udao.findBySid(sid);
		for(Uriage u : ulist) {
			System.out.println(u.getHi() + " : " + u.getKosu());
		}
	}
}


