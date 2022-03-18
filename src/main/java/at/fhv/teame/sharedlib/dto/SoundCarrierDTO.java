package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoundCarrierDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    //SoundCarrier
    private String medium;
    private String price;
    private int stock;
    //Song
    private String title;
    private String artist;
    private int release;
    private String album;

    public static SoundCarrierDTO.Builder builder() {
        return new SoundCarrierDTO.Builder();
    }

    public String title() {
        return this.title;
    }

    public String album() {
        return this.album;
    }

    public String artist() {
        return this.artist;
    }

    public String price() {
        return this.price;
    }

    private int release() {
        return this.release;
    }

    private String medium(){
        return this.medium;
    }

    private int stock() {
        return this.stock;
    }


    private SoundCarrierDTO() {}

    public static class Builder {
        private SoundCarrierDTO instance;

        private Builder() {
            this.instance = new SoundCarrierDTO();
        }

        public Builder withAlbumEntity(String title, String album, String artist, int release) {
            this.instance.title = title;
            this.instance.album = album;
            this.instance.artist = artist;
            this.instance.release = release;

            return this;
        }

        public Builder withSoundCarrierEntity(String price, String medium, int stock){
            this.instance.price = price;
            this.instance.medium = medium;
            this.instance.stock = stock;

            return this;
        }

        public SoundCarrierDTO build(){
            Objects.requireNonNull(this.instance.title, "title must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.album, "album must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.medium, "medium must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.release, "release must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.stock, "stock must be set in SoundCarrierDTO");
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoundCarrierDTO that = (SoundCarrierDTO) o;
        return release == that.release && stock == that.stock && Objects.equals(title, that.title) && Objects.equals(album, that.album) && Objects.equals(artist, that.artist) && Objects.equals(price, that.price) && Objects.equals(medium, that.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, album, artist, price, medium, release, stock);
    }
}