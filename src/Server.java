import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main( String [] args ) {
        try {
            ServerImpl obj = new ServerImpl();

            // creates object for the registry
            PA2Help stub = (PA2Help) UnicastRemoteObject.exportObject(obj, 0);

            // prepping the space in the registry called PA2 for Client to reach out to( hopefully ).
            Registry registry = LocateRegistry.getRegistry();

            // MAKE SURE THE PATH IS THE SAME IN BOTH CLIENT AND SERVER CLASS!!!!!
            registry.rebind("rmi://localhost/PA2Help", stub);

            System.err.println("System ready....");


        } catch (RemoteException e) {
            System.err.println("Oh no! Error has a occurred: " + e);
        }
    }

} // end of public class Server
