package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.PublishMessageDTO;
import at.fhv.teame.sharedlib.dto.ReceiveMessageDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.rmi.exceptions.PublishingFailedException;
import at.fhv.teame.sharedlib.rmi.exceptions.ReceiveFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageService extends Remote {
    void publishMessage(PublishMessageDTO publishMessageDTO, String sessionId) throws RemoteException, PublishingFailedException, InvalidSessionException;

    List<ReceiveMessageDTO> fetchMessages(String sessionId) throws RemoteException, ReceiveFailedException, InvalidSessionException;

    List<String> allTopics(String sessionId) throws RemoteException, InvalidSessionException;
}

