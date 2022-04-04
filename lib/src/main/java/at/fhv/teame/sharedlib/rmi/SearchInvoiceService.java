package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.InvoiceDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SearchInvoiceService extends Remote {
    InvoiceDTO invoiceById(String invoiceId) throws RemoteException;
}
