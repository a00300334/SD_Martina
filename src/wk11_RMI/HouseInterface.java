package wk11_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HouseInterface extends Remote{
	public String getOwner() throws RemoteException;
	public void setOwner(String owner) throws RemoteException;
	public String getAddress() throws RemoteException;
	public void setAddress(String address) throws RemoteException;
}
