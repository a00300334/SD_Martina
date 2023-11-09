package wk11_RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) {
		try {
			House dormer = new House("bunkers", "athlone");
			House bungalow = new House("fahys", "dublin");
			Registry r = LocateRegistry.createRegistry(1234);
			
			r.bind("dormerHouse", dormer);
			r.bind("bungalowHouse", bungalow);
			
		} catch (RemoteException | AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
