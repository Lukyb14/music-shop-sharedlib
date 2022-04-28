package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.WithdrawalFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface WithdrawSoundCarrierService extends Remote {
    void withdrawSoundCarrier(String invoiceId, Map<String, Integer> soundCarrierReturnAmountMap, String sessionId) throws InvalidSessionException, WithdrawalFailedException, RemoteException;
}
