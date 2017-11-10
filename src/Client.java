import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private static String currentDir;
    private static PA2Help stub;

    public static void main( String [] args ) {

        try {

            // getting the absolute path
            currentDir = System.getProperty("user.dir");

            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);

            // Looking up the registry for the remote object
            stub = (PA2Help) registry.lookup("rmi://localhost/PA2Help");


            // Calling the remote method using the obtained object

            // reaches out to ServerImpl class for the return value
            System.out.println( stub.sayHello() );



            // System.out.println("Remote method invoked");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    } // end of method main


} // end of class Client
