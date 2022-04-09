package at.fhv.teame.sharedlib.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationService extends Remote {

    boolean login(String username, String password) throws RemoteException;

}
