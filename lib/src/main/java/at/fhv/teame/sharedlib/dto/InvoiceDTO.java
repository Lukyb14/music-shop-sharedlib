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
    private List<InvoiceLineDTO> invoiceLineItems;

    // Customer Entity
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;

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

    private InvoiceDTO() {
    }

    public static class Builder {
        private final InvoiceDTO instance;

        private Builder() {
            this.instance = new InvoiceDTO();
        }

        public Builder withInvoiceEntity(String invoiceId, String purchaseDate, String paymentMethod,
                                         String currentRefundable, String totalRefundable,
                                         List<InvoiceLineDTO> invoiceLineItems) {
            this.instance.invoiceId = invoiceId;
            this.instance.purchaseDate = purchaseDate;
            this.instance.paymentMethod = paymentMethod;
            this.instance.currentRefundable = currentRefundable;
            this.instance.totalRefundable = totalRefundable;
            this.instance.invoiceLineItems = invoiceLineItems;
            return this;
        }

        public Builder withCustomerEntity(String customerFirstName, String customerLastName, String customerAddress) {

            this.instance.customerFirstName = customerFirstName;
            this.instance.customerLastName = customerLastName;
            this.instance.customerAddress = customerAddress;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(instance, builder.instance);
        }

        @Override
        public int hashCode() {
            return Objects.hash(instance);
        }

        public InvoiceDTO build() {
            Objects.requireNonNull(this.instance.invoiceId, "invoiceId must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.purchaseDate, "purchaseDate must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.paymentMethod, "paymentMethod must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.currentRefundable, "currentRefundable must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.totalRefundable, "totalRefundable must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.invoiceLineItems, "invoiceLineItems must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerFirstName, "customerFirstName must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerLastName, "customerLastName must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.customerAddress, "customerAddress must be set in InvoiceDTO");

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
                && Objects.equals(invoiceLineItems, that.invoiceLineItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, purchaseDate, paymentMethod, currentRefundable,
                totalRefundable, customerFirstName, customerLastName, customerAddress, invoiceLineItems);
    }
}
