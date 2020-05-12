package obj;

public class Teacher {
	String name;
	int nen;	//何年何組の担任か
	int kumi;
	
	public Teacher(String name, int nen, int kumi) {
		this.name = name;
		this.nen = nen;
		this.kumi = kumi;
	}
	
	public Teacher() {
		this("栄", 2, 3);
	}
	
	public void show() {
		if(this.nen == 0 || this.kumi == 0) {
			System.out.println(this.name + "： 担任なし");
		}
		else
		{
			System.out.println(this.name +"： " + this.nen + "年" + this.kumi + "組");
		}
	}
}
