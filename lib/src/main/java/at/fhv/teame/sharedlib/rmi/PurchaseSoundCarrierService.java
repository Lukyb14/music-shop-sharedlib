package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.rmi.exceptions.PurchaseFailedException;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface PurchaseSoundCarrierService extends Remote {

    void confirmPurchase(Map<String, Integer> shoppingCartItems, String paymentMethod, BigDecimal totalPrice) throws PurchaseFailedException, RemoteException;
}
