package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;

public class PublishMessageDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private final String topic;
    private final String title;
    private final String content;

    public PublishMessageDTO(String topic, String title, String content) {
        this.topic = topic;
        this.title = title;
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
