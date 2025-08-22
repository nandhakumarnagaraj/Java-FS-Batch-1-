import java.util.ArrayList;
import java.util.List;

public class Samplee {

	public static void main(String[] args) {
		
		List<String> data = new ArrayList<String>();
		data.add("String1");
		data.add("String2");
		data.add("String3");
		data.add("String4");
		data.add("String5");
		
		String LastBefore= data.get(data.size()-2);
		
		for(String d:data) {
			if(d.equals(LastBefore))
				System.out.println(d);
		
		}
		

	}

}
