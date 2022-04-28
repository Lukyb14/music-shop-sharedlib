package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SessionDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private final String sessionId;
    private final String role;

    public SessionDTO(String sessionId, String role) {
        Objects.requireNonNull(sessionId, "Session Id is required");
        Objects.requireNonNull(role, "role is required");

        this.sessionId = sessionId;
        this.role = role;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getRole() {
        return role;
    }
}
