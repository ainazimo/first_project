package POJO;

import java.math.BigDecimal;
import java.util.Objects;

public class Cars {
    private long ID;
    private String mark;
    private String type;
    private String color;
    private Double engineVolume;
    private String transferType;
    private BigDecimal price;

    public Cars() {
    }

    public Cars(long ID, String mark, String type, String color, Double engineVolume, String transferType, BigDecimal price) {
        this.ID = ID;
        this.mark = mark;
        this.type = type;
        this.color = color;
        this.engineVolume = engineVolume;
        this.transferType = transferType;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public String getMark() {
        return mark;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getTransferType() {
        return transferType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return ID == cars.ID && Objects.equals(mark, cars.mark) && Objects.equals(type, cars.type) && Objects.equals(color, cars.color) && Objects.equals(engineVolume, cars.engineVolume) && Objects.equals(transferType, cars.transferType) && Objects.equals(price, cars.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, mark, type, color, engineVolume, transferType, price);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "ID=" + ID +
                ", mark='" + mark + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", transferType='" + transferType + '\'' +
                ", price=" + price +
                '}';
    }
}
