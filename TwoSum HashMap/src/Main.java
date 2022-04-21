import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(TwoSumWithHash(nums, target)));
	}
	
	private static int[] TwoSumWithHash(int[] nums, int target) {
		HashMap<Integer,Integer> input = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			
			input.put(nums[i], i);
			
		}
		for(int i=0;i<nums.length;i++) {
			
			int secondNumber = target-nums[i];
			if(input.containsKey(secondNumber))
				return new int[] {i,input.get(secondNumber)};
			
		}
		return null;
		
	}

}

