package wk8_serializable;

import java.io.Serializable;

public class Staff implements Serializable{

	private int stafID;
	private String staffName;
	private String staffAddress;
	private int staffSalary;
	
	public Staff(
			int string, 
			String staffName, 
			String staffAddress, 
			int staffSalary) {
		this.stafID = string;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffSalary = staffSalary;
	}


	public int getStafID() {
		return stafID;
	}


	public void setStafID(int stafID) {
		this.stafID = stafID;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getStaffAddress() {
		return staffAddress;
	}


	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}


	public int getStaffSalary() {
		return staffSalary;
	}


	public void setStaffSalary(int staffSalary) {
		this.staffSalary = staffSalary;
	}

}
