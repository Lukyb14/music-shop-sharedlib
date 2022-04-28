package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;
import at.fhv.teame.sharedlib.dto.SoundCarrierDetailsDTO;
import at.fhv.teame.sharedlib.exceptions.InvalidSessionException;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface SearchSoundCarrierServiceRemote {
    List<SoundCarrierDTO> soundCarriersByAlbumName(String album, int pageNr, String sessionId) throws InvalidSessionException;

    List<SoundCarrierDTO> soundCarriersByArtistName(String artist, int pageNr, String sessionId) throws InvalidSessionException;

    List<SoundCarrierDTO> soundCarriersBySongName(String album, int pageNr, String sessionId) throws InvalidSessionException;

    int totResultsByAlbumName(String album, String sessionId) throws InvalidSessionException;

    int totResultsByArtistName(String album, String sessionId) throws InvalidSessionException;

    int totResultsBySongName(String album, String sessionId) throws InvalidSessionException;

    SoundCarrierDetailsDTO soundCarrierDetailsByArticleId(String articleId, String sessionId) throws InvalidSessionException;
}
