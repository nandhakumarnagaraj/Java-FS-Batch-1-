package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> progLanguages = new ArrayList<>();
		progLanguages.add("Java");
		progLanguages.add("C");
		progLanguages.add("C++");
		progLanguages.add("Python");
		progLanguages.add("JavaScript");
		
		progLanguages.forEach(sample ->System.out.println(sample));
		
		progLanguages.stream().forEach(sample -> System.out.println(sample));
	}

}
