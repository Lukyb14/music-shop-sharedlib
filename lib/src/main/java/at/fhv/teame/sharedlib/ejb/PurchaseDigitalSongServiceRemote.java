package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.exceptions.InvalidCredentialsException;

import javax.ejb.Remote;
import java.util.Map;

@Remote
public interface PurchaseDigitalSongServiceRemote {
    void purchaseSong(Map<String, Integer> purchasedSongs, String email, String cvc) throws InvalidCredentialsException;
}
