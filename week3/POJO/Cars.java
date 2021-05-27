import java.math.BigDecimal;
import java.util.Objects;

public class Cars {
    private long ID;
    private String mark;
    private String type;
    private String color;
    private String engineVolume;
    private String transferType;
    private BigDecimal price;

    public Cars() {
    }

    public Cars(long ID, String mark, String type, String color, String engineVolume, String transferType, BigDecimal price) {
        this.ID = ID;
        this.mark = mark;
        this.type = type;
        this.color = color;
        this.engineVolume = engineVolume;
        this.transferType = transferType;
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
