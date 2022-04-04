package at.fhv.teame.sharedlib.dto;

import java.util.List;
import java.util.Objects;

public class InvoiceDTO {
    private static final long serialVersionUID = 6529685098267757690L;

    // Invoice Entity
    private String invoiceId;
    private String purchaseDate;
    private String paymentMethod;
    private String currentRefundable;
    private String totalRefundable;

    // Customer Entity
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;

    // Items Entity
    private List<String> articleIds;
    private List<String> artistNames;
    private List<String> albums;
    private List<String> media;
    private List<Integer> quantities;
    private List<Integer> amountOfReturnableItems;
    private List<Integer> amountOfReturnedItems;
    private List<String> prices;


    public static Builder builder() {
        return new Builder();
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCurrentRefundable() {
        return currentRefundable;
    }

    public String getTotalRefundable() {
        return totalRefundable;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<String> getArticleIds() {
        return articleIds;
    }

    public List<String> getArtistNames() {
        return artistNames;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public List<String> getMedia() {
        return media;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public List<Integer> getAmountOfReturnableItems() {
        return amountOfReturnableItems;
    }

    public List<Integer> getAmountOfReturnedItems() {
        return amountOfReturnedItems;
    }

    public List<String> getPrices() {
        return prices;
    }

    private InvoiceDTO() {
    }

    public static class Builder {
        private final InvoiceDTO instance;

        private Builder() {
            this.instance = new InvoiceDTO();
        }

        public Builder withInvoiceEntity(String invoiceId, String purchaseDate, String paymentMethod,
                                         String currentRefundable, String totalRefundable) {
            this.instance.invoiceId = invoiceId;
            this.instance.purchaseDate = purchaseDate;
            this.instance.paymentMethod = paymentMethod;
            this.instance.currentRefundable = currentRefundable;
            this.instance.totalRefundable = totalRefundable;
            return this;
        }

        public Builder withCustomerEntity(String customerFirstName, String customerLastName, String customerAddress) {

            this.instance.customerFirstName = customerFirstName;
            this.instance.customerLastName = customerLastName;
            this.instance.customerAddress = customerAddress;
            return this;
        }

        public Builder withItemsEntity(List<String> articleIds, List<String> artistNames, List<String> albums,
                                       List<String> media, List<Integer> quantities,
                                       List<Integer> amountOfReturnableItems, List<Integer> amountOfReturnedItems,
                                       List<String> prices) {
            this.instance.articleIds = articleIds;
            this.instance.artistNames = artistNames;
            this.instance.albums = albums;
            this.instance.media = media;
            this.instance.quantities = quantities;
            this.instance.amountOfReturnableItems = amountOfReturnableItems;
            this.instance.amountOfReturnedItems = amountOfReturnedItems;
            this.instance.prices = prices;
            return this;
        }

        public InvoiceDTO build() {
            Objects.requireNonNull(this.instance.invoiceId, "invoiceId must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.purchaseDate, "purchaseDate must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.paymentMethod, "paymentMethod must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.currentRefundable, "currentRefundable must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.totalRefundable, "totalRefundable must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerFirstName, "customerFirstName must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerLastName, "customerLastName must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerAddress, "customerAddress must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.articleIds, "articleIds must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.artistNames, "artistNames must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.albums, "albums must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.media, "media must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.quantities, "quantities must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.amountOfReturnableItems, "amountOfReturnableItems must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.amountOfReturnedItems, "amountOfReturnedItems must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.prices, "prices must be set in InvoiceDTO");

            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDTO that = (InvoiceDTO) o;
        return Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(purchaseDate, that.purchaseDate)
                && Objects.equals(paymentMethod, that.paymentMethod)
                && Objects.equals(currentRefundable, that.currentRefundable)
                && Objects.equals(totalRefundable, that.totalRefundable)
                && Objects.equals(customerFirstName, that.customerFirstName)
                && Objects.equals(customerLastName, that.customerLastName)
                && Objects.equals(customerAddress, that.customerAddress)
                && Objects.equals(articleIds, that.articleIds)
                && Objects.equals(artistNames, that.artistNames)
                && Objects.equals(albums, that.albums)
                && Objects.equals(media, that.media)
                && Objects.equals(quantities, that.quantities)
                && Objects.equals(amountOfReturnableItems, that.amountOfReturnableItems)
                && Objects.equals(amountOfReturnedItems, that.amountOfReturnedItems)
                && Objects.equals(prices, that.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, purchaseDate, paymentMethod, currentRefundable,
                totalRefundable, customerFirstName, customerLastName, customerAddress,
                articleIds, artistNames, albums, media, quantities, amountOfReturnableItems,
                amountOfReturnedItems, prices);
    }
}
