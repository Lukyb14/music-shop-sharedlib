package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

public interface SessionValidationRemote {

    void validateAny(String sessionId) throws InvalidSessionException;

    void validateSeller(String sessionId) throws InvalidSessionException;

    void validateOperator(String sessionId) throws InvalidSessionException;
}
