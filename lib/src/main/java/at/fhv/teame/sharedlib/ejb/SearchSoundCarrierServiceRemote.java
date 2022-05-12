package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.SoundCarrierDTO;
import at.fhv.teame.sharedlib.dto.SoundCarrierDetailsDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface SearchSoundCarrierServiceRemote {
    List<SoundCarrierDTO> soundCarriersByAlbumName(String album, int pageNr);

    List<SoundCarrierDTO> soundCarriersByArtistName(String artist, int pageNr);

    List<SoundCarrierDTO> soundCarriersBySongName(String album, int pageNr);

    int totResultsByAlbumName(String album);

    int totResultsByArtistName(String artist);

    int totResultsBySongName(String song);

    SoundCarrierDetailsDTO soundCarrierDetailsByArticleId(String articleId);
}
