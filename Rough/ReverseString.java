package Rough;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mystring=sc.next();
		int mylength=mystring.length();
		String reversed="";
		
		for(int i=mylength-1;i>=0;i--) {
			reversed+=mystring.charAt(i);
			
		}
		System.out.println(reversed);

	}

}
