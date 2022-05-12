package at.fhv.teame.sharedlib.ejb;

import javax.ejb.Remote;

@Remote
public interface LoggedInClientRemote {
    void inform();
}
