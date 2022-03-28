package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.ShoppingCartItemDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.PurchaseFailedException;

import java.rmi.Remote;
import java.util.List;

public interface PurchaseSoundCarrierService extends Remote {

    void confirmPurchase(List<ShoppingCartItemDTO> shoppingCartItemDTO, String paymentMethod) throws PurchaseFailedException;
}
