package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		// find the even number in stream
		List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 6, 77, 8, 88, 8, 8, 99);

		List<Integer> result = data.stream()
									.filter(n -> (n % 2 == 0))
									.collect(Collectors.toList());
		System.out.println(result);

	}

}
