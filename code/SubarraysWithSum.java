package code;

import java.util.HashMap;

public class SubarraysWithSum {

	public static void main(String[] args) {

		int[] input = { 10, 2, -2, -20, 10 };
		int target = -10;

		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
		// Key , //Value
		int sum = 0;
		int count = 0;

		for (int num : input) { // 10,2,-2,-20, 10
			sum = sum + num;

			if (sum == target) { // 0+10, 10+2, 12+ -2, 10 + -20,
				count++; // 1
			}

			if (prefixSumMap.containsKey(sum - target)) { // return types Boolean //-10 -(-10) = 0
				count = count + prefixSumMap.get(sum - target); // 1 + (-10 -(-10)) //1
			}

			prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1); // -10,
		}

		System.out.println("Total subarrays with sum " + target + ": " + count);
		System.out.println(prefixSumMap);
	}
}
