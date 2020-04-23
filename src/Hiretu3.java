
public class Hiretu3 {

	public static void main(String[] args) {

//		//1番
//		int[] nums = {8, 5, 9, 2, 4};
//		for(int num : nums) {
//			System.out.println(num);
//		}


//		//2番
//		int[] nums = {8, 5, 9, 2, 4};
//		int sum = 0;
//		for(int num : nums) {
//			sum += num;
//		}
//		System.out.println(sum);


		//3番
//		int[] nums = {8, 5, 9, 2, 4};
//		int count = 0;
//		for(int num : nums) {
//			if(num >= 5) {
//				count++;
//			}
//		}
//		System.out.println(count);


//		//4番
//		int[] nums = {8, 5, 9, 2, 4};
//		for(int i=0; i<nums.length; i++) {
//			nums[i] *= 2;
//			System.out.print(nums[i] + ",");
//		}

		//5番
		int[] nums = {8, 5, 9, 2, 4};
		int max = 0;
		for(int num : nums) {
			num *= 2;
			if(num > max) {
				max = num;
			}
		}
		System.out.println(max);

	}

}
