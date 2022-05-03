package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.SessionDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.LoginFailedException;
import at.fhv.teame.sharedlib.rmi.LoggedInClient;

import javax.ejb.Remote;

@Remote
public interface AuthenticationServiceRemote {
    SessionDTO login(String username, String password) throws LoginFailedException;
    void logout(String sessionId);

    void rememberClient(LoggedInClient loggedInClient, String sessionId) throws InvalidSessionException;

}
