package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.ShoppingCartDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.rmi.exceptions.PurchaseFailedException;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface PurchaseSoundCarrierService extends Remote {
    void confirmPurchase(ShoppingCartDTO shoppingCartDTO, String sessionId) throws PurchaseFailedException, InvalidSessionException, RemoteException;

}
