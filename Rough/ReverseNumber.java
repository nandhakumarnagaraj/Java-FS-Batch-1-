package Rough;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 1234;
		int reversed = 0;
		int digit;

		while (a != 0) {
			digit = a % 10;
			reversed = reversed * 10 + digit;
			a = a / 10;
		}

		System.out.println("Reversed number: " + reversed);
	}
}
