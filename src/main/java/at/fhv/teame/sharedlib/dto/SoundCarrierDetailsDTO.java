package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class SoundCarrierDetailsDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    //SoundCarrier
    private String articleId;
    private String medium;
    private String price;
    private int stock;

    //Album
    private String albumName;
    private String label;
    private String genre;
    private String artist;
    private SongDTO[] songs;
    
    public static Builder builder() {
        return new Builder();
    }

    public String getArticleId() {
        return articleId;
    }

    public String getMedium() {
        return medium;
    }

    public String getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public String getLabel() {
        return label;
    }

    public String getGenre() {
        return genre;
    }

    public SongDTO[] getSongs() {
        return songs;
    }

    private SoundCarrierDetailsDTO() {}

    public static class Builder {
        private final SoundCarrierDetailsDTO instance;

        private Builder() {
            this.instance = new SoundCarrierDetailsDTO();
        }

        public Builder withSoundCarrierEntity(String articleId,String medium, String price, int stock){
            this.instance.articleId = articleId;
            this.instance.medium = medium;
            this.instance.price = price;
            this.instance.stock = stock;
            return this;
        }

        public Builder withAlbumEntity(String albumName, String label, String genre, String artist, SongDTO[] songs) {
            this.instance.albumName = albumName;
            this.instance.label = label;
            this.instance.genre = genre;
            this.instance.songs = songs;
            this.instance.artist = artist;
            return this;
        }
        
        public SoundCarrierDetailsDTO build(){
            Objects.requireNonNull(this.instance.articleId, "articleId must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.medium, "medium must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.label, "label must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.genre, "genre must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.songs, "songs must be set in SoundCarrierDTO");
            
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoundCarrierDetailsDTO that = (SoundCarrierDetailsDTO) o;
        return stock == that.stock && Objects.equals(articleId, that.articleId) && Objects.equals(medium, that.medium) && Objects.equals(price, that.price) && Objects.equals(albumName, that.albumName) && Objects.equals(label, that.label) && Objects.equals(genre, that.genre) && Arrays.equals(songs, that.songs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(articleId, medium, price, stock, albumName, label, genre);
        result = 31 * result + Arrays.hashCode(songs);
        return result;
    }
}