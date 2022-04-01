package at.fhv.teame.sharedlib.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    private String lastname;
    private String firstname;
    private LocalDate birthDate;
    private String address;

    public static CustomerDTO.Builder builder(){return new Builder();}

    public String getSurname(){return lastname;}

    public String getFirstname(){return  firstname;}

    public LocalDate getBirthdate(){return birthDate;}

    public String getAddress(){return address;}

    private CustomerDTO(){}

    public static class Builder {
        private final CustomerDTO instance;

        private Builder() {this.instance = new CustomerDTO();}

        public CustomerDTO.Builder withCustomerEntity(String lastname, String firstname, LocalDate birthDate, String address){
            this.instance.lastname = lastname;
            this.instance.firstname = firstname;
            this.instance.birthDate = birthDate;
            this.instance.address = address;
            return this;
        }

        public CustomerDTO build(){
            Objects.requireNonNull(this.instance.lastname, "lastname must be set in CustomerDTO");
            Objects.requireNonNull(this.instance.firstname, "firstname must be set in CustomerDTO");
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
        return lastname.equals(that.lastname) && firstname.equals(that.firstname) && birthDate.equals(that.birthDate) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, birthDate, address);
    }
}
