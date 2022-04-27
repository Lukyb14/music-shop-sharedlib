package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.SessionDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.LoginFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationService extends Remote {
    SessionDTO login(String username, String password) throws RemoteException, LoginFailedException;
    void logout(String sessionId) throws RemoteException;

    void rememberClient(LoggedInClient loggedInClient, String sessionId) throws RemoteException, InvalidSessionException;

}
