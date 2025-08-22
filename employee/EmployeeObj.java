package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeObj {

	public static void main(String[] args) {
		List<EmployeeExample> employees = new ArrayList<EmployeeExample>();
		employees.add(new EmployeeExample(1, null, null, 10000));
		employees.add(new EmployeeExample(2, null, null, 22000));
		employees.add(new EmployeeExample(3, null, null, 23000));
		employees.add(new EmployeeExample(4, null, null, 25000));
		Collections.sort(employees, new MyLogical());
		employees.stream().forEach(e ->System.out.println(e));
	}
}

class MyLogical implements Comparator<EmployeeExample> {
    @Override
    public int compare(EmployeeExample o1, EmployeeExample o2) {
        return Double.compare(o2.getSalary(), o1.getSalary()); // Descending
    }
}

