package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;
import at.fhv.teame.sharedlib.dto.SoundCarrierDetailsDTO;
import at.fhv.teame.sharedlib.rmi.exceptions.InvalidSessionException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SearchSoundCarrierService extends Remote {
    List<SoundCarrierDTO> soundCarriersByAlbumName(String album, int pageNr, String sessionId) throws InvalidSessionException, RemoteException;

    List<SoundCarrierDTO> soundCarriersByArtistName(String artist, int pageNr, String sessionId) throws InvalidSessionException, RemoteException;

    List<SoundCarrierDTO> soundCarriersBySongName(String album, int pageNr, String sessionId) throws InvalidSessionException, RemoteException;

    int totResultsByAlbumName(String album, String sessionId) throws InvalidSessionException, RemoteException;

    int totResultsByArtistName(String album, String sessionId) throws InvalidSessionException, RemoteException;

    int totResultsBySongName(String album, String sessionId) throws InvalidSessionException, RemoteException;

    SoundCarrierDetailsDTO soundCarrierDetailsByArticleId(String articleId, String sessionId) throws InvalidSessionException, RemoteException;
}
