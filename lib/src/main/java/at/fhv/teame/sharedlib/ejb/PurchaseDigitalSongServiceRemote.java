package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.exceptions.InvalidCredentialsException;

import javax.ejb.Remote;
import java.util.List;


@Remote
public interface PurchaseDigitalSongServiceRemote {
    void purchaseSong(List<String> purchasedSongs, String email, String cvc) throws InvalidCredentialsException;
}
