package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.CustomerDTO;
import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Remote
public interface CustomerServiceRemote {
    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName, int pageNr) throws RemoteException;

    List<CustomerDTO> getCustomerByFamilyName(String familyName, int pageNr) throws RemoteException;

    int totResultsByFullName(String givenName, String familyName) throws RemoteException;

    int totResultsByFamilyName(String familyName) throws RemoteException;
}
