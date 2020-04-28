package obj;
import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {
		ArrayList<Chugakusei> student = new ArrayList<Chugakusei>();

		student.add(new Chugakusei("山上",90,92,94,91));
		student.add(new Chugakusei("山中",82,85,88,82));
		student.add(new Chugakusei("山下",62,65,68,60));
		for(Chugakusei jc : student){
			int sum = jc.goukei();
			double ave = jc.heikin();

			jc.show();
			System.out.println("合計：" + sum + "点");
			System.out.println("平均：" + ave + "点");
		}

	}

}
