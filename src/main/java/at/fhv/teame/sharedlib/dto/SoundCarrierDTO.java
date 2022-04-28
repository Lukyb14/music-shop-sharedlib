package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoundCarrierDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    //SoundCarrier
    private String articleId;
    private String medium;
    private String price;
    private int stock;
    private int nrOfSongs;

    //Album
    private String albumName;
    private String artist;
    private String genre;

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

    public String getGenre() {
        return genre;
    }

    public int getNrOfSongs() {
        return nrOfSongs;
    }

    private SoundCarrierDTO() {}

    public static class Builder {
        private final SoundCarrierDTO instance;

        private Builder() {
            this.instance = new SoundCarrierDTO();
        }

        public SoundCarrierDTO.Builder withSoundCarrierEntity(String articleId, String medium, String price, int stock, int nrOfSongs){
            this.instance.articleId = articleId;
            this.instance.medium = medium;
            this.instance.price = price;
            this.instance.stock = stock;
            this.instance.nrOfSongs = nrOfSongs;
            return this;
        }

        public SoundCarrierDTO.Builder withAlbumEntity(String albumName, String artist, String genre) {
            this.instance.albumName = albumName;
            this.instance.artist = artist;
            this.instance.genre = genre;
            return this;
        }

        public SoundCarrierDTO build(){
            Objects.requireNonNull(this.instance.articleId, "articleId must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.medium, "medium must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.genre, "genre must be set in SoundCarrierDTO");
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoundCarrierDTO that = (SoundCarrierDTO) o;
        return stock == that.stock && nrOfSongs == that.nrOfSongs && Objects.equals(articleId, that.articleId) && Objects.equals(medium, that.medium) && Objects.equals(price, that.price) && Objects.equals(albumName, that.albumName) && Objects.equals(artist, that.artist) && Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, medium, price, stock, nrOfSongs, albumName, artist, genre);
    }
}
