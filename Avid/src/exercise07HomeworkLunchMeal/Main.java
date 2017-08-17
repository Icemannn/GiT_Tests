package exercise07HomeworkLunchMeal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Ilian on 7/31/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//      Number of offered meals and drinks in Lunch Menu
        System.out.print("Enter number of Vegan meals: ");
        int veganMeals = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of Non-vegan meals: ");
        int nonVeganMeals = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of drinks in menu: ");
        int drinks = Integer.parseInt(reader.readLine());

        Menu menu = new Menu();

//       Adding meals in Vegan menu

        for (int i = 0; i < veganMeals ; i++) {
            System.out.print("Enter vegan meal name: ");
            String veganMealName = reader.readLine();
            System.out.print("Enter this vegan meal price: ");
            double veganMealPrice = Double.parseDouble(reader.readLine());
            menu.addItemVegan(new Vegan(veganMealName, veganMealPrice));
        }
        for (int i = 0; i < nonVeganMeals ; i++) {
            System.out.print("Enter non-vegan meal name: ");
            String nonVeganMealName = reader.readLine();
            System.out.print("Enter this non-vegan meal price: ");
            double nonVeganMealPrice = Double.parseDouble(reader.readLine());
            menu.addItemNonVegan(new NonVegan(nonVeganMealName, nonVeganMealPrice));
        }
        for (int i = 0; i < drinks; i++) {
            System.out.print("Enter drink name: ");
            String drinkName = reader.readLine();
            System.out.print("Enter this drink price: ");
            double drinkPrice = Double.parseDouble(reader.readLine());
            menu.addItemDrink(new Drinks(drinkName, drinkPrice));

        }
        menu.printVeganMenu();







    }
}
