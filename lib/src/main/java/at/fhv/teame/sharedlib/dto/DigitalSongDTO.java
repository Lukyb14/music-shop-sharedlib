package at.fhv.teame.sharedlib.dto;

import java.util.Objects;

public class DigitalSongDTO {
    private static final long serialVersionUID = 6529685098267757690L;

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

    public static class Builder {
        private final DigitalSongDTO instance;

        private Builder() {
            this.instance = new DigitalSongDTO();
        }

        public Builder withDigitalSongEntity(String artist, String title, String genre,
                                             String duration, String releaseDate, String price) {
            this.instance.artist = artist;
            this.instance.title = title;
            this.instance.genre = genre;
            this.instance.duration = duration;
            this.instance.releaseDate = releaseDate;
            this.instance.price = price;

            return this;
        }

        public DigitalSongDTO build() {
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
        return Objects.equals(artist, that.artist) && Objects.equals(title, that.title) && Objects.equals(genre, that.genre) && Objects.equals(duration, that.duration) && Objects.equals(releaseDate, that.releaseDate) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, genre, duration, releaseDate, price);
    }
}
