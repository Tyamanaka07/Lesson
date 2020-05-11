package DB;

import java.util.ArrayList;

public class UriageSample {

	public static void main(String[] args) {
		UriageDAO dao = new UriageDAO();

		//Uriage u = new Uriage(6, 2, 3);
		//dao.insert(u);

		//Uriage u = dao.findByUid(2);
		//System.out.println(u.getKosu());

		dao.findAll();
		ArrayList<Uriage> list = dao.findAll();
		for(Uriage s : list) {
			System.out.println(s.getKosu());
		}




//		ArrayList<Uriage> list = dao.findAll();
//		for(Uriage u : list) {
//
//		}

	}

}
