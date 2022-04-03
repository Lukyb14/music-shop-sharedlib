package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.CustomerDTO;

import java.util.List;

public interface SearchCustomerService {

    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName);

    List<CustomerDTO> getCustomerByFamilyName(String familyName);
}
