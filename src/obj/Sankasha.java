package obj;

public class Sankasha {
	private String name;
	private int age;

	public Sankasha(String name, int age) throws SankashaException {
		if(age<0) {
			throw new SankashaException("年齢が不正です");
		}
		if(name .equals("") ) {
			throw new SankashaException("名前を入力してください");
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
