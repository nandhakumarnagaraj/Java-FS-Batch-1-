package Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		// Write a program to count the number of strings starting with a specific
		// letter.

		List<String> names = List.of("Apple", "Banana", "Avocado", "Apricot", "Mango");
		char specificLetter = 'A';

		long count = names.stream()
						  .filter(name -> name.startsWith(String.valueOf(specificLetter)))
						  .count();

		System.out.println("Number of strings starting with '" + specificLetter + "': " + count);

		
		// Write a program to find the maximum element in a list using streams.
		
		List<Integer> numbers = List.of(10, 55, 23, 78, 12);

        int max = numbers.stream()
                         .min(Integer::compare)
                         .orElseThrow(); 

        System.out.println("Maximum element is: " + max);
        
     // Write a program to find duplicate elements in a list using streams.
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "grape");

        Set<String> duplicates = items.stream()
							          .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
							          .entrySet().stream()
							          .filter(entry -> entry.getValue() > 1)
							          .map(Map.Entry::getKey)
							          .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates);
	}

}
