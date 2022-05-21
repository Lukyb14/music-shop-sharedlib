package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.CustomerDTO;

import javax.ejb.Remote;
import java.util.List;
import java.util.Optional;

@Remote
public interface SearchCustomerServiceRemote {

    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName, int pageNr);

    List<CustomerDTO> getCustomerByFamilyName(String familyName, int pageNr);

    CustomerDTO getCustomerByEmailAndCvc(String email, String cvc);

    int totResultsByFullName(String givenName, String familyName);

    int totResultsByFamilyName(String familyName);
}
