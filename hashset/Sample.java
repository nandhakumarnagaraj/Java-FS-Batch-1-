package hashset;

import java.util.HashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {

		Set<Integer> data = new HashSet<Integer>();
		data.add(10);
		data.add(11);
		data.add(12);
		data.add(13);
		data.add(21);
		data.add(15);
		data.add(35);
		data.add(15);
		data.add(19);

		System.out.println(data);
		System.out.println("hi".hashCode());
		//s[0] * 31 (n-1)
		System.out.println(104*31+(105));

	}

}
