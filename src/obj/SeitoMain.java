package obj;

public class SeitoMain {

	public static void main(String[] args) {
		Seito student = new Seito();

		student.name = "田尻 貴嗣";
		student.kokugo = 90;
		student.sansu = 85;
		student.shakai = 97;

		int sum = student.goukei();
		double ave = student.heikin();

		student.show();
		System.out.println("合計：" + sum + "点");
		System.out.println("平均：" + ave + "点");
	}

}
