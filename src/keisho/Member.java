package keisho;

public class Member {
	String name;
	String tel;

	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public void show() {
		System.out.println("名前：" +name + "\n電話番号：" + tel);
	}
	public String toString() {
		return "名前：" + name + "\n電話：" + tel;
	}

}
