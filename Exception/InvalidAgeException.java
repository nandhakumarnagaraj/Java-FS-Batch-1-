package Exception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String e) {
		super(e);
	}

	static String demo = "Age Invalid Exception";

	public static void ageCheck(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException(demo);

		} else {
			System.out.println("You are eligible to vote...");
		}
	}
}
