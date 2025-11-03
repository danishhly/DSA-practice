package programmes;
import java.util.*;

public class TwoSum {
	static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if(map.containsKey(complement)); {
				return new int[]{map.get(complement), i};
			}
		}
		return new int[]{};

	}

	public static void main(String[] args){
		int[] arr = {3, 5, 9, 8, 10};
		int target = 8;
		int[] ans = twoSum(arr, target);
		System.out.println("Indices: " + Arrays.toString(ans));
	}
}