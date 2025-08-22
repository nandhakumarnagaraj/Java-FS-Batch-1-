package arraylist;

import java.util.ArrayList;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<String>();

		data.add("ougjoui");// 0
		data.add(null);// 1
		data.add(null);// 2
		data.add(null);// 3
		data.add(0, null);
		System.out.println(data);
	}

}
