package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.WithdrawalFailedException;

import javax.ejb.Remote;
import java.util.Map;

@Remote
public interface WithdrawSoundCarrierServiceRemote {
    void withdrawSoundCarrier(String invoiceId, Map<String, Integer> soundCarrierReturnAmountMap, String sessionId) throws InvalidSessionException, WithdrawalFailedException;
}
