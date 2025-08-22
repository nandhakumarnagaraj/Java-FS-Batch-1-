package ThreadsExample;

public class MainMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method thread


		PostMan post = new PostMan();
		Receiver re = new Receiver();

		Thread t1 = new Thread(post);
		Thread t2 = new Thread(re);
		t1.start();
		t2.start();

	}

}
