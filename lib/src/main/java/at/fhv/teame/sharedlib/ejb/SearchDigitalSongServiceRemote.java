package at.fhv.teame.sharedlib.ejb;

import at.fhv.teame.sharedlib.dto.DigitalSongDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface SearchDigitalSongServiceRemote {
    List<DigitalSongDTO> digitalSongByTitle(String title, int pageNr, int pageSize);

    List<DigitalSongDTO> digitalSongByArtist(String artist, int pageNr, int pageSize);

    List<DigitalSongDTO> digitalSongByGenre(String genre, int pageNr, int pageSize);

    int totResultsByTitle(String title);

    int totResultsByArtistName(String artist);

    int totResultsByGenre(String genre);
}
