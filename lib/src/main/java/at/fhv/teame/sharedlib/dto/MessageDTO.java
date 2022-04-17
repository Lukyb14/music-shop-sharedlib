package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private final String topic;
    private final String title;
    private final String content;
    private final long timestamp;

    public MessageDTO(String topic, String title, String content, long timestamp) {
        this.topic = topic;
        this.title = title;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
