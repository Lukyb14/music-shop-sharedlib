package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.WithdrawalDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.WithdrawalFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReturnSoundCarrierService extends Remote {
    public void withDrawSoundCarrier(WithdrawalDTO withdrawalDTO) throws WithdrawalFailedException, RemoteException;
}
