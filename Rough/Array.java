package Rough;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 2, 9, 0, 2, 7 };
		int len = arr.length;
		int temp = 0;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len -1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
				} 
			}
		}
		System.out.println(arr[len-2]);
	}

}
