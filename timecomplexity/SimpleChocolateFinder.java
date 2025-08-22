package timecomplexity;

public class SimpleChocolateFinder {

	static int[] boxes = new int[100]; 
	static int chocolateBox = 77; 

	public static void main(String[] args) {
		boxes[chocolateBox] = 1; // Put chocolate in one box

		// O(n²) - Ask every box about every other
		System.out.println("O(n²): Found chocolate in box " + findQuadratic());

		// O(n) - Check each box one by one
		System.out.println("O(n): Found chocolate in box " + findLinear());

		// O(log n) - Divide and conquer (Binary Search)
		System.out.println("O(log n): Found chocolate in box " + findBinary(0, boxes.length - 1));
	}

	// O(n²) method
	static int findQuadratic() {
		for (int i = 0; i < boxes.length; i++) {
			for (int j = 0; j < boxes.length; j++) {
				System.out.println("I =" + i +" "+ "J =" +j );
				if (boxes[j] == 1)
					return j;
			}
		}
		return -1;
	}

	// O(n) method
	static int findLinear() {
		for (int i = 0; i < boxes.length; i++) {
			System.out.println("I =" + i);
			if (boxes[i] == 1)
				return i;
		}
		return -1;
	}

	// O(log n) method (binary search simulation)
	static int findBinary(int left, int right) {
		if (left > right)
			return -1;

		int mid = (left + right) / 2;
		System.out.println("Left Index "+left);
		System.out.println("Right Index "+right);
		System.out.println("Mid Index "+ mid);
		

		if (boxes[mid] == 1)
			return mid;
		else if (chocolateBox < mid)
			return findBinary(left, mid - 1);
		else
			return findBinary(mid + 1, right);
	}
}
