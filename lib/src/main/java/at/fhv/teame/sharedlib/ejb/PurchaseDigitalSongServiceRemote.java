package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.exceptions.InvalidCredentialsException;
import at.fhv.teame.sharedlib.exceptions.PurchaseFailedException;

import javax.ejb.Remote;
import java.util.List;


@Remote
public interface PurchaseDigitalSongServiceRemote {
    void purchaseDigitalSong(String userId, List<String> purchasedSongs, String creditCardNumber, String cvc) throws InvalidCredentialsException, PurchaseFailedException;
}
