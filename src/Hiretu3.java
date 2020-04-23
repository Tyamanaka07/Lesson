
public class Hiretu3 {

	public static void main(String[] args) {
		int[] nums = {8, 5, 9, 2, 4};
		int sum = 0;
		int count = 0;
		int max = 0;
		
		for(int num : nums) {
			if(num >= 5) {
				count++;
			}
			System.out.print(num + ", ");
			sum += num;
			num *= 2;
		}
		System.out.println("");
		System.out.println(sum);
		System.out.println(count);
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i] * 2;
			if(nums[i] >= max) {
			max = nums[i];
			}
			System.out.print(nums[i] + ", ");
		}
		System.out.println("");
		System.out.println(max);
	}

}
