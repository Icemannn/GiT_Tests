package exercise07HomeworkLunchMeal;

/**
 * Created by Ilian on 7/31/2017.
 */
public class NonVegan extends Vegan{
    public NonVegan(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "NonVegan{}";
    }
}
