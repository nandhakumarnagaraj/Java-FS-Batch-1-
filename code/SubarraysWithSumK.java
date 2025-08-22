package code;

import java.util.HashMap;

public class SubarraysWithSumK {

	public static void main(String[] args) {

		int[] input = { 10, 2, -2, -20, 10 };
		int target = -10;

		// HashMap to store prefix sum and its frequency
		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
		// Key -> prefix sum value
		// Value -> frequency of that prefix sum

		int sum = 0; // To store running prefix sum
		int count = 0; // To store count of subarrays with sum = target

		// Iterate through all elements of the array
		for (int num : input) { // input: 10, 2, -2, -20, 10
			sum = sum + num; // update running sum

			// Case 1: If the running sum itself is equal to target
			if (sum == target) { // check if entire prefix sum equals target
				count++; // increment count
			}

			// Case 2: Check if there exists a prefix sum such that
			// (current_sum - prefix_sum = target)
			if (prefixSumMap.containsKey(sum - target)) {
				// If yes, add its frequency to count
				count = count + prefixSumMap.get(sum - target);
			}

			// Store the current prefix sum into the map with updated frequency
			prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
		}

		// Print the total number of subarrays
		System.out.println("Total subarrays with sum " + target + ": " + count);
	}
}
