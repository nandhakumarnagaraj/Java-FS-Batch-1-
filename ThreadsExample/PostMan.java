package ThreadsExample;

public class PostMan extends Thread {

	Box box;

	public void run() {

	}

	public PostMan() {

	}

	public PostMan(Box b) {
//		this.box.letter= b.letter;
		this.box = b;
	}
}
