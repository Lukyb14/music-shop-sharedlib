package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoundCarrierDetailsDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    //SoundCarrier
    private String medium;
    private String price;
    private int stock;

    //Album
    private String name;
    private String label;
    private String genre;

    //Song
    private String title;
    private String artist;
    private String release;
    private String recording;


    public String medium() {
        return medium;
    }

    public String price() {
        return price;
    }

    public int stock() {
        return stock;
    }

    public String name() {
        return name;
    }

    public String label() {
        return label;
    }

    public String genre() {
        return genre;
    }

    public String title() {
        return title;
    }

    public String artist() {
        return artist;
    }

    public String release() {
        return release;
    }

    public String recording() {
        return recording;
    }

    private SoundCarrierDetailsDTO() {}

    public static class Builder {
        private SoundCarrierDetailsDTO instance;

        private Builder() {
            this.instance = new SoundCarrierDetailsDTO();
        }

        public SoundCarrierDetailsDTO.Builder withSoundCarrierEntity(String medium, String price, int stock){
            this.instance.medium = medium;
            this.instance.price = price;
            this.instance.stock = stock;

            return this;
        }

        public SoundCarrierDetailsDTO.Builder withAlbumEntity(String name, String label, String genre) {
            this.instance.name = name;
            this.instance.label = label;
            this.instance.genre = genre;

            return this;
        }

        public SoundCarrierDetailsDTO.Builder withSongEntity(String title, String artist, String release, String recording) {
            this.instance.title = title;
            this.instance.artist = artist;
            this.instance.release = release;
            this.instance.recording = recording;

            return this;
        }

        public SoundCarrierDetailsDTO build(){
            Objects.requireNonNull(this.instance.medium, "medium must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.stock, "stock must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.name, "name must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.label, "label must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.genre, "genre must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.title, "title must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.release, "release must be set in SoundCarrierDetailsDTO");
            Objects.requireNonNull(this.instance.release, "recording must be set in SoundCarrierDetailsDTO");
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoundCarrierDetailsDTO that = (SoundCarrierDetailsDTO) o;
        return stock == that.stock && Objects.equals(medium, that.medium) && Objects.equals(price, that.price) && Objects.equals(name, that.name) && Objects.equals(label, that.label) && Objects.equals(genre, that.genre) && Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(release, that.release) && Objects.equals(recording, that.recording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medium, price, stock, name, label, genre, title, artist, release, recording);
    }
}
