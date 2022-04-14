package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.PublishMessageDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessageService extends Remote {
    void publishMessage(PublishMessageDTO publishMessageDTO, String sessionId) throws RemoteException;
}
