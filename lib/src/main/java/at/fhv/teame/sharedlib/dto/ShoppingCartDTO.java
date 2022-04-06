package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Objects;


public class ShoppingCartDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;


    private String articleId;
    private String albumName;
    private String artist;
    private int nrOfSongs;
    private String medium;
    private int amount;
    private int stock;
    private String price;


    public static Builder builder() {
        return new Builder();
    }

    public String getArticleId() {
        return articleId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public int getNrOfSongs() {
        return nrOfSongs;
    }

    public String getMedium() {
        return medium;
    }

    public int getAmount() {
        return amount;
    }

    public int getStock() {
        return stock;
    }

    public String getPrice() {
        return price;
    }


    private ShoppingCartDTO() {}


    public static class Builder {
        private final ShoppingCartDTO instance;

        private Builder() {
            this.instance = new ShoppingCartDTO();

        }


        private Builder withShoppingCartEntity(String articleId, String albumName, String artist,
                                               int nrOfSongs, String medium, int amount,
                                               int stock, String price) {
            this.instance.articleId = articleId;
            this.instance.albumName = albumName;
            this.instance.artist = artist;
            this.instance.nrOfSongs = nrOfSongs;
            this.instance.medium = medium;
            this.instance.amount = amount;
            this.instance.stock = stock;
            this.instance.price = price;
            return this;

        }




        public ShoppingCartDTO build() {
            Objects.requireNonNull(this.instance.articleId, "articleId must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.artist, "artist must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.nrOfSongs, "nrOfSongs must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.medium, "medium must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.stock, "stock must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in ShoppingCartDTO");

            return this.instance;
        }


    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ShoppingCartDTO that = (ShoppingCartDTO) o;
        return Objects.equals(articleId, that.articleId)
                && Objects.equals(albumName, that.albumName)
                && Objects.equals(artist, that.artist)
                && Objects.equals(nrOfSongs, that.nrOfSongs)
                && Objects.equals(medium, that.medium)
                && Objects.equals(amount, that.amount)
                && Objects.equals(stock, that.stock)
                && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, albumName, artist, nrOfSongs, medium,
                amount, stock, price);
    }
}
