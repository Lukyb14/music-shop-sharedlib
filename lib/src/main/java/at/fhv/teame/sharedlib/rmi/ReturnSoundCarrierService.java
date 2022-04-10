package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.WithdrawalDTO;

import java.rmi.Remote;

public interface ReturnSoundCarrierService extends Remote {
    public void withDrawSoundCarrier(WithdrawalDTO withdrawalDTO);
}
