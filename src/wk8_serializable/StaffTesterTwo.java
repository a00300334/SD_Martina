package wk8_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaffTesterTwo {

	
	
	// if file not exist serialize 3 diferent staff objects
	
	public static void main(String[] args) {
		// Deserialize a file 
		deserializer();
		
	}
	
	public static void deserializer() {
		try {
			FileInputStream fileIn = new FileInputStream("multi.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff r = (Staff) objectIn.readObject();
			Staff r1 = (Staff) objectIn.readObject();
			Staff r2 = (Staff) objectIn.readObject();
			Staff r3 = (Staff) objectIn.readObject();
			
			objectIn.close();
			fileIn.close();
			System.out.println(r.getStaffName());
			System.out.println(r1.getStaffName());
			System.out.println(r2.getStaffName());
			System.out.println(r3.getStaffName());
			
		}catch(FileNotFoundException fi) {
			serializer();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void serializer() {
		Staff s1 = new Staff(12, "john kelly", "dublin", 5000);
		Staff s2 = new Staff(23, "marry kelly", "athlone", 5000);
		Staff s3 = new Staff(43, "Kome kelly", "newbridge", 5000);
		Staff s4 = new Staff(21, "Clone kelly", "galway", 5000);
		
		try {
			FileOutputStream filein = new FileOutputStream("multi.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(filein);
			objectOut.writeObject(s1);
			objectOut.writeObject(s2);
			objectOut.writeObject(s3);
			objectOut.writeObject(s4);
			System.out.println("object written to file");
			objectOut.close();
			filein.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
