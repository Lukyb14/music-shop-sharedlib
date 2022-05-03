package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.ShoppingCartDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.PurchaseFailedException;

import javax.ejb.Remote;

@Remote
public interface PurchaseSoundCarrierServiceRemote {
    void confirmPurchase(ShoppingCartDTO shoppingCartDTO, String sessionId) throws PurchaseFailedException, InvalidSessionException;

}
