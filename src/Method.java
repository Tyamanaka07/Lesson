
public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドで計算します");
		hello("yosokamomi");
		int keisan =keisan(100,200);
		System.out.println(keisan);

		System.out.println("終わりました");
		int sum = goukei(8);
		System.out.println(sum);

		show("田中", 30);
		for(int i=10; i<=20; i++) {
		jijo(i);
		}
		System.out.println("");

		String[] names = {"山本","佐藤","鈴木"};
		for(String name : names) {
			hello(name);
		}


		if(isGusuu(9)) {
			System.out.println("偶数です");
		}
		else {
			System.out.println("奇数です");
		}

		String time = getTimeName(25);
		System.out.println(time);
		
		
		
		int[] nums = {5,8,9,2};
		printArray(nums);
		
		String data = "apple,orange,lemon";
		String[]  fruits = data.split(",");
		System.out.println(fruits[2]);
		
		
		int x = getLast(nums);
		System.out.println(x);
		
	}
	
	public static int getLast(int[] array) {
		return array[array.length - 1];
	}
	
	
	public static void printArray(int[] array) {
		for(int num : array) {
			System.out.println(num);
		}
	}

	public static String getTimeName(int hour) {
		if(0 <= hour && hour <= 11) {
			return "午前";
		}
		if(12 <= hour && hour <= 24) {
			return "午後";
		}
		return "エラー";
	}


	public static boolean isGusuu(int num) {
		return num%2 == 0;
	}

	public static void test(int x) {
		x = 20;
	}

	public static void jijo(int num) {
		System.out.print(num * num + ",");
	}
	public static void jijo(double num) {
		System.out.print(num * num + ",");
	}

	public static void hello(String name) {
		System.out.println(name + "さん。こんにちは");
	}

	public static int keisan(int num1, int num2) {
		return num1+ num2;
	}

	public static int goukei(int num) {
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		return sum;
	}


	public static void show(String name, int age) {
		System.out.println(name + "さんは" + age + "さいです");
	}


}
