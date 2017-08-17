package exercise05ResturantMenu;

/**
 * Created by Ilian on 7/27/2017.
 */
public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price *1.2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

