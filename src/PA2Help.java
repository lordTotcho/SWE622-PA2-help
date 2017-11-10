import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the location where all of your functions( e.g. remove directories, remove files, etc. ) live
 * The serverImpl class contains all of the logic for the respective functions
 */
public interface PA2Help extends Remote {

    String sayHello() throws RemoteException;

} // end of public interface PA2Help
