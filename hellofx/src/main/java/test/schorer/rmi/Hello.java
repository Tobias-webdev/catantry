package test.schorer.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	
	public String getBaum() throws RemoteException;

}
