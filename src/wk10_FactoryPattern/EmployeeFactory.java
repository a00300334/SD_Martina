package wk10_FactoryPattern;

public class EmployeeFactory {
	public static Employee getEmploye(int hoursAllocated, double hourlyRate) {
		if( hoursAllocated >= 40) {
			return new FullTimeEmployee(hourlyRate);
		}else {
			return new PartTimeEmployee(hourlyRate);
		}
	}
}
