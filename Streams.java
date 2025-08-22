import java.util.List;
import java.util.Optional;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method
		List<String> data = List.of("String1", "String2", "String3", "String4", "String5");

		String demo = data.stream()
				.filter(name -> name.startsWith("1"))
				.findFirst()
				.orElse("Not Found");
		System.out.println(demo);

	}

}
