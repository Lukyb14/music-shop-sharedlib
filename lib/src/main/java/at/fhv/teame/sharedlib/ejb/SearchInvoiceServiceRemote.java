package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.InvoiceDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

import javax.ejb.Remote;

@Remote
public interface SearchInvoiceServiceRemote {
    InvoiceDTO invoiceById(String invoiceId, String sessionId) throws InvalidSessionException;
}
