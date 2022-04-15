package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.PublishMessageDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.PublishingFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageService extends Remote {
    void publishMessage(PublishMessageDTO publishMessageDTO, String sessionId) throws RemoteException, PublishingFailedException;

    List<String> allTopics();
}

