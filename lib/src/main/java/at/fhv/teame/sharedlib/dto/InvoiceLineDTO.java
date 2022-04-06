package at.fhv.teame.sharedlib.dto;

import java.util.Objects;

public class InvoiceLineDTO {
    private static final long serialVersionUID = 6529685098267757690L;

    private String articleId;
    private String artistName;
    private String album;
    private String medium;
    private int quantity;
    private int amountOfReturnableItems;
    private int amountOfReturnedItems;
    private String price;

    public static Builder builder() {
        return new Builder();
    }

    public String getArticleId() {
        return articleId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbum() {
        return album;
    }

    public String getMedium() {
        return medium;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmountOfReturnableItems() {
        return amountOfReturnableItems;
    }

    public int getAmountOfReturnedItems() {
        return amountOfReturnedItems;
    }

    public String getPrice() {
        return price;
    }

    private InvoiceLineDTO() {

    }

    public static class Builder {
        private final InvoiceLineDTO instance;

        private Builder() {
            this.instance = new InvoiceLineDTO();
        }

        public Builder withInvoiceLineEntity(String articleId, String artistName, String album,
                                       String medium, int quantity, int amountOfReturnableItem,
                                       int amountOfReturnedItem, String price
        ) {
            this.instance.articleId = articleId;
            this.instance.artistName = artistName;
            this.instance.album = album;
            this.instance.medium = medium;
            this.instance.quantity = quantity;
            this.instance.amountOfReturnableItems = amountOfReturnableItem;
            this.instance.amountOfReturnedItems = amountOfReturnedItem;
            this.instance.price = price;
            return this;
        }

        public InvoiceLineDTO build() {
            Objects.requireNonNull(this.instance.articleId, "articleId must be set in InvoiceLineDTO");
            Objects.requireNonNull(this.instance.artistName, "artistName must be set in InvoiceLineDTO");
            Objects.requireNonNull(this.instance.album, "album must be set in InvoiceLineDTO");
            Objects.requireNonNull(this.instance.medium, "medium must be set in InvoiceLineDTO");
            Objects.requireNonNull(this.instance.price, "price must be set in InvoiceLineDTO");

            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceLineDTO that = (InvoiceLineDTO) o;
        return quantity == that.quantity
                && amountOfReturnableItems == that.amountOfReturnableItems
                && amountOfReturnedItems == that.amountOfReturnedItems
                && Objects.equals(articleId, that.articleId)
                && Objects.equals(artistName, that.artistName)
                && Objects.equals(album, that.album)
                && Objects.equals(medium, that.medium)
                && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, artistName, album, medium, quantity,
                amountOfReturnableItems, amountOfReturnedItems, price);
    }
}
