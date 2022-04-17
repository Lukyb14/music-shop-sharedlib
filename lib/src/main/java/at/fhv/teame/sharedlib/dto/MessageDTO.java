package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private final String id;
    private final String topic;
    private final String subject;
    private final String content;
    private final long timestamp;


    public MessageDTO(String topic, String subject, String content) {
        this(null, topic, subject, content, 0);
    }

    public MessageDTO(String id, String topic, String subject, String content, long timestamp) {
        this.id = id;
        this.topic = topic;
        this.subject = subject;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getContent() {
        return this.content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
