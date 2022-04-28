package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.InvoiceDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SearchInvoiceService extends Remote {
    InvoiceDTO invoiceById(String invoiceId, String sessionId) throws InvalidSessionException, RemoteException;
}
