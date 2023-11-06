package wk10_FactoryPattern;

public class FactoryTester {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmploye(30,25.9);
		System.out.println( employee.getHourlyRate());
		
		Employee employee2 = EmployeeFactory.getEmploye(40,25.9);
		System.out.println( employee2.getHourlyRate());
		
	}

}
