package Rough;

public class fibnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		System.out.print(first);
		System.out.print(second);
		for(int i=0;i<10;i++) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
		

	}

}
