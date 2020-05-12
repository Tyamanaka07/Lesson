package DB;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO mdao = new MemberDAO();

		ArrayList<Member> mlist = mdao.findAll();
		for(Member m : mlist) {
			System.out.println(m.getMid() +" : " +m.getName());
		}

		System.out.println("誰のアドレスを見ますか？（midを入力）:");
		int mid = new java.util.Scanner(System.in).nextInt();

		Member m = mdao.findByMid(mid);		//midが2の行を表示
		System.out.println(m.getAdr());


	}

}
