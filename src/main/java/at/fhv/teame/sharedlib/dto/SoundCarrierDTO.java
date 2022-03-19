package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoundCarrierDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    //SoundCarrier
    private String medium;
    private String price;
    private int stock;
    //Album
    private String albumName;
    private SongDTO[] songs;
    
    public static Builder builder() {
        return new Builder();
    }

    public String medium(){
        return this.medium;
    }

    public String price() {
        return this.price;
    }

    public int stock() {
        return this.stock;
    }

    public String albumName() {
        return this.albumName;
    }

    public SongDTO[] songs() {
        return this.songs;
    }

    private SoundCarrierDTO() {}

    public static class Builder {
        private final SoundCarrierDTO instance;

        private Builder() {
            this.instance = new SoundCarrierDTO();
        }

        public Builder withSoundCarrierEntity(String medium, String price, int stock){
            this.instance.medium = medium;
            this.instance.price = price;
            this.instance.stock = stock;

            return this;
        }

        public Builder withAlbumEntity(String name, SongDTO[] songs) {
            this.instance.albumName = name;
            this.instance.songs = songs;

            return this;
        }
        
        public SoundCarrierDTO build(){
            Objects.requireNonNull(this.instance.medium, "medium must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in SoundCarrierDTO");
            Objects.requireNonNull(this.instance.songs, "songs must be set in SoundCarrierDTO");
            
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoundCarrierDTO that = (SoundCarrierDTO) o;
        return stock == that.stock && medium.equals(that.medium) && price.equals(that.price) && albumName.equals(that.albumName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medium, price, stock, albumName);
    }
}