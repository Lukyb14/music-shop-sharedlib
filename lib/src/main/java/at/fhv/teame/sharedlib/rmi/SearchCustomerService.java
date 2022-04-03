package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.CustomerDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SearchCustomerService extends Remote {

    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName) throws RemoteException;

    List<CustomerDTO> getCustomerByFamilyName(String familyName) throws RemoteException;
}
