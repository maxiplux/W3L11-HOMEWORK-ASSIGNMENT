package prob2;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee>
{
   

	

	 

	@Override
	public int compare(Employee o1, Employee o2) {
		 
		return o1.getSsn().compareTo(o2.getSsn());
	}
}