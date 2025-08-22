package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// key = Username
		// Value== password
		Map<String, String> data = new HashMap<String, String>();
		String UserName = "user1";
		String UserPassword = "Password@12";
		data.put(UserName, UserPassword);
		System.out.println("First attempt");

		String User1Password2 = "Password@21";
		System.out.println("Second Attempt");
		data.put(UserName, User1Password2);

		String UserName2 = "user1";
		if (data.containsKey(UserName2)) {
			System.out.println("Your Account exixted");
		} else {
			data.put(UserName2, UserPassword);
			System.out.println("Added...");
		}
		System.out.println(data);
	}

}
