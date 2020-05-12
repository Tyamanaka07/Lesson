package sales;

import java.util.ArrayList;

public class SalesMain {

	public static void main(String[] args) {
		ArrayList<Sales> sal = new ArrayList<Sales>();

		sal.add(new Sales("田中", 1500));
		sal.add(new Sales("山田", 3000));
		sal.add(new MemberSales("鈴木",1000));

		System.out.println(sal);

		int sum = 0;
		for(Sales s : sal) {
			sum = sum + s.getTotal();
		}
		System.out.println("合計:" + sum + "円");

	}

}
