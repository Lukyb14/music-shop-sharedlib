package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.WithdrawalDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.rmi.exceptions.WithdrawalFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WithdrawSoundCarrierService extends Remote {
    void withDrawSoundCarrier(WithdrawalDTO withdrawalDTO, String sessionId) throws InvalidSessionException, WithdrawalFailedException, RemoteException;
}
