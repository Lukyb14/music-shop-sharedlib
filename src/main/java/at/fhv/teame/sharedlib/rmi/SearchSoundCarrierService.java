package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;
import at.fhv.teame.sharedlib.dto.SoundCarrierDetailsDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SearchSoundCarrierService extends Remote {
    List<SoundCarrierDTO> soundCarriersByAlbumName(String album, int pageNr) throws RemoteException;

    List<SoundCarrierDTO> soundCarriersByArtistName(String artist, int pageNr) throws RemoteException;

    List<SoundCarrierDTO> soundCarriersBySongName(String album, int pageNr) throws RemoteException;

    int totResultsByAlbumName(String album) throws RemoteException;

    int totResultsByArtistName(String album) throws RemoteException;

    int totResultsBySongName(String album) throws RemoteException;

    SoundCarrierDetailsDTO soundCarrierDetailsByArticleId(String articleId) throws RemoteException;
}
