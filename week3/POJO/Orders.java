import java.util.Date;
import java.util.Objects;

public class Orders {
    private Long ID;
    private String nameOrder;
    private Date createdDate;
    private String address;
    private String phoneNumber;

    public Orders() {
    }

    public Orders(Long ID, String nameOrder, Date createdDate, String address, String phoneNumber) {
        this.ID = ID;
        this.nameOrder = nameOrder;
        this.createdDate = createdDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getID() {
        return ID;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(ID, orders.ID) && Objects.equals(nameOrder, orders.nameOrder) && Objects.equals(createdDate, orders.createdDate) && Objects.equals(address, orders.address) && Objects.equals(phoneNumber, orders.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nameOrder, createdDate, address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ID=" + ID +
                ", nameOrder='" + nameOrder + '\'' +
                ", createdDate=" + createdDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
