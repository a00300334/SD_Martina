package wk10_FactoryPattern;

public class FullTimeEmployee extends Employee{
	private double hourlyRate;
	
	public FullTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getHourlyRate() {
		System.out.println("This is a Full time employee... ");
		return hourlyRate;
	}
	
}
