package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.CustomerDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SearchCustomerService extends Remote {

    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName, int pageNr, String sessionId) throws InvalidSessionException, RemoteException;

    List<CustomerDTO> getCustomerByFamilyName(String familyName, int pageNr, String sessionId) throws InvalidSessionException, RemoteException;

    int totResultsByFullName(String givenName, String familyName, String sessionId) throws InvalidSessionException, RemoteException;

    int totResultsByFamilyName(String familyName, String sessionId) throws InvalidSessionException, RemoteException;
}
