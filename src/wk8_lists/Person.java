package wk8_lists;

public class Person{
	private String name;
	private String number;
	private String county;
	
	public Person(String name, String number, String county) {
		this.name = name;
		this.number = number;
		this.county = county;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: "+ this.name + " phone: " + this.number + " county: " + this.county;
	}
}
