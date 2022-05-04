package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.CustomerDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Remote
public interface CustomerServiceRemote {
    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName, int pageNr, String sessionId) throws InvalidSessionException;

    List<CustomerDTO> getCustomerByFamilyName(String familyName, int pageNr, String sessionId) throws InvalidSessionException;

    int totResultsByFullName(String givenName, String familyName, String sessionId) throws InvalidSessionException;

    int totResultsByFamilyName(String familyName, String sessionId) throws InvalidSessionException;
}
