package obj;

public class Book extends Shouhin{
	String author;

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	public void show() {
		super.show();
		System.out.println("著者名：" + author);
	}

}
