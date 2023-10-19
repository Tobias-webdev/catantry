package test.schorer.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;



public class Server implements Hello {
	public String sayHello(int number) throws RemoteException {
		String txt = "Hello" + number + "World \n";
		System.out.println(txt);
		return txt;
	}

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.getRegistry(); // wenn noch keine Reg läuft dann starten, sonst mit der
															// Verbinden
			System.out.println(reg); // Port etc anzeigen

			Server server = new Server();
			UnicastRemoteObject.exportObject(server, 1077); // Portnummer 0 -> Zufall
			reg.rebind("Hello", server); // Object registrieren

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getBaum() throws RemoteException {
		// TODO Auto-generated method stub
		return "Baum";
	}
}
