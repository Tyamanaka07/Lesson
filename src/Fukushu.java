
public class Fukushu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		int sum = 0;
		int count = 0;
		
		for(int num : tensus) {
			System.out.print(num + ",");
			sum += num;
			if(num >= 70) {
				count++;
			}
		}
		System.out.println("");
		System.out.println(sum);
		System.out.println(count);
	}

}
