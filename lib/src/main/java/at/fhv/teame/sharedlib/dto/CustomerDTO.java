package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    private String familyName;
    private String givenName;
    private LocalDate birthDate;
    private String address;

    public static CustomerDTO.Builder builder(){return new Builder();}

    public String getFamilyName(){return familyName;}

    public String getGivenName(){return  givenName;}

    public LocalDate getBirthdate(){return birthDate;}

    public String getAddress(){return address;}

    private CustomerDTO(){}

    public static class Builder {
        private final CustomerDTO instance;

        private Builder() {this.instance = new CustomerDTO();}

        public CustomerDTO.Builder withCustomerEntity(String familyName, String givenName, LocalDate birthDate, String address){
            this.instance.familyName = familyName;
            this.instance.givenName = givenName;
            this.instance.birthDate = birthDate;
            this.instance.address = address;
            return this;
        }

        public CustomerDTO build(){
            Objects.requireNonNull(this.instance.familyName, "familyName must be set in CustomerDTO");
            Objects.requireNonNull(this.instance.givenName, "givenName must be set in CustomerDTO");
            Objects.requireNonNull(this.instance.birthDate, "birthDate must be set in CustomerDTO");
            Objects.requireNonNull(this.instance.address, "address must be set in CustomerDTO");
            return this.instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName) && Objects.equals(birthDate, that.birthDate) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyName, givenName, birthDate, address);
    }
}
