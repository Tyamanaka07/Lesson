package KeisukeHondaJanken;

public class Main {

	public static void main(String[] args) {
		System.out.println("KeisukeHonda「僕とじゃんけん、勝ったらいいことがあります。\nそれじゃあいきます。じゃーんけーん...」");
		System.out.println("何を出す？\n\"グー\"...1　\n\"チョキ\"...2　\n\"パー\"...3");

		Janken ote = new Janken();
		String te = ote.janken();
		System.out.println("ポンッ！\n\n\n");
		if(te != "グー") {
			System.out.println("YOU LOSE！");
			System.out.println("KeisukeHonda「俺の勝ち。なんで負けたか\n明日まで考えといてください」\n");
			System.out.println("KeisukeHonda「ほな、また明日。」");
		}
		else {
			System.out.println("YOU WIN!!");
			System.out.println("KeisukeHonda「やるやん。でもこれは三回勝負。");
			System.out.println("KeisukeHonda「じゃーんけーん...」");
		}
		System.out.println("");

	}

}
