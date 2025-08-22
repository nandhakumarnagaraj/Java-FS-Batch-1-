package ThreadsExample;

public class Box {

	String letter;
	boolean isLetterAvailable = false;


	public synchronized void receiveLetter() {
		System.out.println("Waiting for letter");
		while (!isLetterAvailable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized void deliverLetter() {

		while (isLetterAvailable) {
			try {
				notify();
				System.out.println("You have a new letter");
				isLetterAvailable = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
