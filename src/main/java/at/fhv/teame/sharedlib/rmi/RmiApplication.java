package at.fhv.teame.sharedlib.rmi;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RmiApplication extends Remote {
    public List<SoundCarrierDTO> allSoundCarriers() throws RemoteException;

    public List<SoundCarrierDTO> soundCarriersByAlbumName(String album) throws RemoteException;

    public List<SoundCarrierDTO> soundCarriersByArtistName(String artist) throws RemoteException;
}
