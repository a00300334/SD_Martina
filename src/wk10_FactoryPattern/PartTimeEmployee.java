package wk10_FactoryPattern;

public class PartTimeEmployee extends Employee{
	private double hourlyRate;
	
	public PartTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getHourlyRate() {
		System.out.println("This is a Part time employee... ");
		return hourlyRate;
	}
	
}

