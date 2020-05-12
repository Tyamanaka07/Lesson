package keisho;

public class NetMember extends Member{
	String mail;

	public NetMember(String name, String tel, String mail) {
		super(name, tel);
		this.mail = mail;
	}
	public void show() {
		super.show();
		System.out.println("メールアドレス：" + mail);
	}
	public String toString() {
		return super.toString() + "\n" +  this.mail;
	}
}
