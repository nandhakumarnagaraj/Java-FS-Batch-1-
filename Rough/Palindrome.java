package Rough;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		boolean palindrome=false;
		Scanner sc =new Scanner(System.in);
		String first=sc.nextLine();
		int n=first.length()-1;
		for(int i=0;i<n/2;i++) {
			if(first.charAt(i)==first.charAt(n-i)) {
				palindrome=true;
			}
		}
		System.out.println(palindrome);
	}

}
