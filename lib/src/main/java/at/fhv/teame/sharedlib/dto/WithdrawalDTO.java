package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class WithdrawalDTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    // Withdrawal Entity
    private String invoiceId;
    private Map<String, Integer> soundCarrierWithAmount;

    public static Builder builder() {
        return new Builder();
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public Map<String, Integer> getSoundCarrierWithAmount() {
        return soundCarrierWithAmount;
    }

    private WithdrawalDTO() {}

    public static class Builder {
        private final WithdrawalDTO instance;

        private Builder() {
            this.instance = new WithdrawalDTO();
        }

        public Builder withWithDrawalEntity(String invoiceId, 
                                            Map<String, Integer> soundCarrierWithAmount) {
            this.instance.invoiceId = invoiceId;
            this.instance.soundCarrierWithAmount = soundCarrierWithAmount;
            
            return this;
        }
        
        public WithdrawalDTO build() {
            Objects.requireNonNull(this.instance.invoiceId, "invoiceId must be set in WithdrawalDTO");
            Objects.requireNonNull(this.instance.soundCarrierWithAmount, "soundCarrierWithAmount must be set in WithdrawalDTO");
            
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WithdrawalDTO that = (WithdrawalDTO) o;
        return Objects.equals(invoiceId, that.invoiceId) && Objects.equals(soundCarrierWithAmount, that.soundCarrierWithAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, soundCarrierWithAmount);
    }
}
