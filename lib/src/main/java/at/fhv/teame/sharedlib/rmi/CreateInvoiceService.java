package at.fhv.teame.sharedlib.rmi;

import java.rmi.Remote;
import java.util.Map;

public interface CreateInvoiceService extends Remote {
    void createInvoice(Map<String, Integer> shoppingCartItems);
}
