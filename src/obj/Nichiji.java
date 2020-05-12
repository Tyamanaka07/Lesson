package obj;

public class Nichiji extends Hizuke {
	int hour;
	int minute;

	public void show() {
		super.show();
		this.showjikan();
	}

	public Nichiji(int tuki, int hi, int hour, int minute) {
		super(tuki, hi);
		this.hour = hour;
		this.minute = minute;
	}

	public void showjikan() {
		System.out.println(hour + "時" + minute + "分");
	}
}
