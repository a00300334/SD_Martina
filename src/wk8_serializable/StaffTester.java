package wk8_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaffTester {

	public static void main(String[] args) {
		Staff s1 = new Staff(12, "john kelly", "dublin", 5000);
		Staff s2 = new Staff(23, "marry kelly", "dublin", 5000);
		
		//Serialize
		
		try {
			FileOutputStream fileOut = new FileOutputStream("staff2.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(s1);
			objectOut.close();
			fileOut.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// First try to Deserialize if there is none create one. 
		try {
			FileInputStream fileIn = new FileInputStream("staf2.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff s0 = (Staff) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println(s0.getStaffName());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
