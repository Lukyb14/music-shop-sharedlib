package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.MessageDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.DeletionFailedException;
import at.fhv.teame.sharedlib.rmi.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.rmi.exceptions.PublishingFailedException;
import at.fhv.teame.sharedlib.rmi.exceptions.ReceiveFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageService extends Remote {
    void publishMessage(MessageDTO messageDTO, String sessionId) throws RemoteException, PublishingFailedException, InvalidSessionException;

    List<MessageDTO> fetchMessages(String sessionId) throws RemoteException, ReceiveFailedException, InvalidSessionException;

    List<String> allTopics(String sessionId) throws RemoteException, InvalidSessionException;

    void deleteMessage(String topic, String messageId, String sessionId) throws RemoteException, InvalidSessionException, DeletionFailedException;
}

