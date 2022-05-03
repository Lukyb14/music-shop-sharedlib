package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.MessageDTO;
import at.fhv.teame.sharedlib.exceptions.DeletionFailedException;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;
import at.fhv.teame.sharedlib.exceptions.PublishingFailedException;
import at.fhv.teame.sharedlib.exceptions.ReceiveFailedException;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface MessageServiceRemote {
    void publishMessage(MessageDTO messageDTO, String sessionId) throws PublishingFailedException, InvalidSessionException;

    List<MessageDTO> fetchMessages(String sessionId) throws ReceiveFailedException, InvalidSessionException;

    List<String> allTopics(String sessionId) throws InvalidSessionException;

    void deleteMessage(String topic, String messageId, String sessionId) throws InvalidSessionException, DeletionFailedException;
}

