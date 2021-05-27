import java.util.Objects;

public class Customers {
    private long ID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;

    public Customers(){
    }

    public Customers(long ID,String firstName, String lastName, String phoneNumber,String email, String address){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return ID == customers.ID && Objects.equals(firstName, customers.firstName) && Objects.equals(lastName, customers.lastName) && Objects.equals(phoneNumber, customers.phoneNumber) && Objects.equals(email, customers.email) && Objects.equals(address, customers.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, phoneNumber, email, address);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
