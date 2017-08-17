import java.util.ArrayList;

/**
 * Created by Ilian on 7/20/2017.
 */
    public class Phone {

    String manufacturer;
    String model;
    double price;
    int yearReleased;

    public Phone(String manufacturer, String model, double price, int yearReleased) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.yearReleased = yearReleased;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearReleased=" + yearReleased +
                '}';
    }
}
