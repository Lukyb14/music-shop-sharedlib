package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.CustomerDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CustomerServiceRemote {
    List<CustomerDTO> getCustomerByFullName(String givenName, String familyName, int pageNr);

    List<CustomerDTO> getCustomerByFamilyName(String familyName, int pageNr);

    CustomerDTO getCustomerByCreditCardNumberAndCvc(String creditCardNumber, String cvc);

    int totResultsByFullName(String givenName, String familyName);

    int totResultsByFamilyName(String familyName);
}
