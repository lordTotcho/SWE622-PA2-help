import java.rmi.RemoteException;

public class ServerImpl implements PA2Help {

    /**
     * Uses the methods that came from the interface PA2Help and has all of the logic to complete the respective operation
     * The end result sends back to the Client class
     * @return
     * @throws RemoteException
     */
    public String sayHello() throws RemoteException {
        return "Hello World!!";
    }
}
