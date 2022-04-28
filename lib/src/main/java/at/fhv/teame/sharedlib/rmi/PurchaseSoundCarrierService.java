package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.ShoppingCartDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.PurchaseFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PurchaseSoundCarrierService extends Remote {
    void confirmPurchase(ShoppingCartDTO shoppingCartDTO, String sessionId) throws PurchaseFailedException, InvalidSessionException, RemoteException;

}
