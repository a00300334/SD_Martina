package wk11_RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HouseClient {

	public static void main(String[] args) {
		System.out.println("Cient has started ");
		
		try {
			 Registry registry = LocateRegistry.getRegistry("localhost",1234);
			 HouseInterface h1 = (HouseInterface)registry.lookup("bungalowHouse");
			 HouseInterface h2 = (HouseInterface)registry.lookup("dormerHouse");
			 
			
			System.out.println(h1.getAddress() +  " " + h1.getOwner());
			System.out.println(h2.getAddress() +  " " + h2.getOwner());
		}catch(Exception e)
		{
			
		}

	}

}
