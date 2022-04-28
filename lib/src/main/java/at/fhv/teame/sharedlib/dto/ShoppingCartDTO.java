package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class ShoppingCartDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private Map<String, Integer> purchasedItems;
    private String paymentMethod;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;

    public static Builder builder() {
        return new Builder();
    }

    public Map<String, Integer> getPurchasedItems() {
        return purchasedItems;
    }

    public String getPaymentMethod() {
        return paymentMethod;
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

    private ShoppingCartDTO() {
    }

    public static class Builder {
        private final ShoppingCartDTO instance;

        private Builder() {
            this.instance = new ShoppingCartDTO();

        }

        public Builder withShoppingCartEntity(Map<String, Integer> purchasedItems,
                                               String paymentMethod,
                                               String customerFirstName,
                                               String customerLastName,
                                               String customerAddress
        ) {
            this.instance.purchasedItems = purchasedItems;
            this.instance.paymentMethod = paymentMethod;
            this.instance.customerFirstName = customerFirstName;
            this.instance.customerLastName = customerLastName;
            this.instance.customerAddress = customerAddress;
            return this;
        }

        public ShoppingCartDTO build() {
            Objects.requireNonNull(this.instance.purchasedItems, "purchasedItems must be set in ShoppingCartDTO");
            Objects.requireNonNull(this.instance.paymentMethod, "paymentMethod must be set in ShoppingCartDTO");

            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartDTO that = (ShoppingCartDTO) o;
        return Objects.equals(purchasedItems, that.purchasedItems)
                && Objects.equals(paymentMethod, that.paymentMethod)
                && Objects.equals(customerFirstName, that.customerFirstName)
                && Objects.equals(customerLastName, that.customerLastName)
                && Objects.equals(customerAddress, that.customerAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasedItems, paymentMethod, customerFirstName, customerLastName, customerAddress);
    }
}

