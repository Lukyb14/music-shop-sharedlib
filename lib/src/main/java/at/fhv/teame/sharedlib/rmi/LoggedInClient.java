package at.fhv.teame.sharedlib.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoggedInClient extends Remote {

    void inform() throws RemoteException;
}
