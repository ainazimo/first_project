package POJO;

import java.util.Date;
import java.util.Objects;

public class Orders {
    private Long ID;
    private String nameOrder;
    private Long customersID;
    private Long carsID;
    private Date createdDate;

    public Orders() {
    }

    public Orders(Long ID, String nameOrder, Long customersID, Long carsID, Date createdDate) {
        this.ID = ID;
        this.nameOrder = nameOrder;
        this.customersID = customersID;
        this.carsID = carsID;
        this.createdDate = createdDate;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public void setCustomersID(Long customersID) {
        this.customersID = customersID;
    }

    public void setCarsID(Long carsID) {
        this.carsID = carsID;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getID() {
        return ID;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public Long getCustomersID() {
        return customersID;
    }

    public Long getCarsID() {
        return carsID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
