package at.fhv.teame.sharedlib.dto;

import java.util.Arrays;
import java.util.Objects;

public class InvoiceDTO {
    private static final long serialVersionUID = 6529685098267757690L;

    // Invoice Entity
    private String invoiceId;
    private String purchaseDate;
    private String paymentMethod;
    private String toRefund;
    private InvoiceLineDTO[] invoiceLineItems;

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

    public String getToRefund() {
        return toRefund;
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

    public InvoiceLineDTO[] getInvoiceLineItems() {
        return invoiceLineItems;
    }

    private InvoiceDTO() {
    }

    public static class Builder {
        private final InvoiceDTO instance;

        private Builder() {
            this.instance = new InvoiceDTO();
        }

        public Builder withInvoiceEntity(String invoiceId, String purchaseDate, String paymentMethod,
                                         String currentRefundable,
                                         InvoiceLineDTO[] invoiceLineItems) {
            this.instance.invoiceId = invoiceId;
            this.instance.purchaseDate = purchaseDate;
            this.instance.paymentMethod = paymentMethod;
            this.instance.toRefund = currentRefundable;
            this.instance.invoiceLineItems = invoiceLineItems;
            return this;
        }

        public Builder withCustomerEntity(String customerFirstName, String customerLastName, String customerAddress) {

            this.instance.customerFirstName = customerFirstName;
            this.instance.customerLastName = customerLastName;
            this.instance.customerAddress = customerAddress;
            return this;
        }

        public InvoiceDTO build() {
            Objects.requireNonNull(this.instance.invoiceId, "invoiceId must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.purchaseDate, "purchaseDate must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.paymentMethod, "paymentMethod must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.toRefund, "currentRefundable must be set in InvoiceDTO");
            Objects.requireNonNull(this.instance.invoiceLineItems, "invoiceLineItems must be set in InvoiceDTO");

            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDTO that = (InvoiceDTO) o;
        return Objects.equals(invoiceId, that.invoiceId) && Objects.equals(purchaseDate, that.purchaseDate) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(toRefund, that.toRefund) && Arrays.equals(invoiceLineItems, that.invoiceLineItems) && Objects.equals(customerFirstName, that.customerFirstName) && Objects.equals(customerLastName, that.customerLastName) && Objects.equals(customerAddress, that.customerAddress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(invoiceId, purchaseDate, paymentMethod, toRefund, customerFirstName, customerLastName, customerAddress);
        result = 31 * result + Arrays.hashCode(invoiceLineItems);
        return result;
    }
}
