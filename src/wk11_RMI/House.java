package wk11_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class House extends UnicastRemoteObject implements HouseInterface{
	
	private String owner, address;
	
	public House(String owner, String address) throws RemoteException{
		this.owner = owner;
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
