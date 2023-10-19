package test.schorer.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Player {
	public static void main(String[] args) {

		Registry registry;
		try {
			registry = LocateRegistry.getRegistry("localhost");
			Hello stub = (Hello) registry.lookup("HelloServer");
			System.out.println(stub.getBaum());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// hier Name der VM oder so eingeben
 catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
