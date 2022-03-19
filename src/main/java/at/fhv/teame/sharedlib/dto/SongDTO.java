package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SongDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private String songName;
    private String artist;
    private String release;

    public String songName() {
        return this.songName;
    }
    public String artist() {
        return this.artist;
    }
    public String release() {
        return this.release;
    }

    public static Builder builder() {
        return new Builder();
    }

    private SongDTO() {}

    public static class Builder {
        private final SongDTO instance;

        private Builder() {
            this.instance = new SongDTO();
        }

        public Builder withSongEntity(String title, String artist, String release) {
            this.instance.songName = title;
            this.instance.artist = artist;
            this.instance.release = release;

            return this;
        }

        public SongDTO build(){
            Objects.requireNonNull(this.instance.songName, "songName must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.release, "release must be set in SoundCarrierDTO");
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongDTO songDTO = (SongDTO) o;
        return songName.equals(songDTO.songName) && artist.equals(songDTO.artist) && release.equals(songDTO.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, artist, release);
    }
}
