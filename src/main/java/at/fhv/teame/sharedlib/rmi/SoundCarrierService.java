package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SoundCarrierService extends Remote {
    List<SoundCarrierDTO> soundCarriersByAlbumName(String album, int pageNr) throws RemoteException;

    List<SoundCarrierDTO> soundCarriersByArtistName(String artist, int pageNr) throws RemoteException;

    List<SoundCarrierDTO> soundCarriersBySongName(String album, int pageNr) throws RemoteException;
}
