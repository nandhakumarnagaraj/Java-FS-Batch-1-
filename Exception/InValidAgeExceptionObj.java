package Exception;

public class InValidAgeExceptionObj {

	public static void main(String[] args) {

		try {
			InvalidAgeException.ageCheck(19);
			
			
		} catch (InvalidAgeException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
