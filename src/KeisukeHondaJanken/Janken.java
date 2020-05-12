package KeisukeHondaJanken;

public class Janken {
	
	public String janken() {
		int num = new java.util.Scanner(System.in).nextInt();
		switch(num) {
		case 1:
			return "グー";
			
		case 2:
			return "チョキ";
			
		case 3:
			return "パー";
			
		default:
			return 0 + "";
			
		}
	}
}
