package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.SessionDTO;
import at.fhv.teame.sharedlib.exceptions.LoginFailedException;
import javax.ejb.Remote;

@Remote
public interface AuthenticationServiceRemote {
    SessionDTO login(String username, String password) throws LoginFailedException;
    void logout(String sessionId);
}
