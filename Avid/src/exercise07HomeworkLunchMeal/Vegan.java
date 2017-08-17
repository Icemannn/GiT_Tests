package exercise07HomeworkLunchMeal;

/**
 * Created by Ilian on 7/31/2017.
 */
public class Vegan {
    private String name;
    private double price;

    public Vegan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vegan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
