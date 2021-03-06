package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;

public class DigitalSongDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private String id;
    private String artist;
    private String title;
    private String genre;
    private String duration;
    private String releaseDate;
    private String price;

    public static Builder builder() {
        return new Builder();
    }

    private DigitalSongDTO() {}

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public static class Builder {
        private final DigitalSongDTO instance;

        private Builder() {
            this.instance = new DigitalSongDTO();
        }

        public Builder withDigitalSongEntity(String artist, String title, String genre,
                                             String duration, String releaseDate, String price, String id) {
            this.instance.artist = artist;
            this.instance.title = title;
            this.instance.genre = genre;
            this.instance.duration = duration;
            this.instance.releaseDate = releaseDate;
            this.instance.price = price;
            this.instance.id = id;

            return this;
        }

        public DigitalSongDTO build() {
            Objects.requireNonNull(this.instance.artist, "id must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.title, "title must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.genre, "genre must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.duration, "duration must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.releaseDate, "releaseDate must be set in DigitalSongDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in DigitalSongDTO");

            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSongDTO that = (DigitalSongDTO) o;
        return Objects.equals(artist, that.artist) && Objects.equals(title, that.title) && Objects.equals(genre, that.genre) && Objects.equals(duration, that.duration) && Objects.equals(releaseDate, that.releaseDate) && Objects.equals(price, that.price) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artist, title, genre, duration, releaseDate, price);
    }
}
