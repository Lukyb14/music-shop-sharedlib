package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.InvoiceDTO;

import javax.ejb.Remote;

@Remote
public interface SearchInvoiceServiceRemote {
    InvoiceDTO invoiceById(String invoiceId);
}
