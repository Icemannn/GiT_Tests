package exercise08MealCaloriesPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Meal> meals = new ArrayList<>();

        int positions = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < positions ; i++) {
            String name = scanner.nextLine();
            int calories = Integer.parseInt(scanner.nextLine());
            double price = Double.parseDouble(scanner.nextLine());
            meals.add(new Meal(name, calories, price));

        }

        System.out.println(meals.get(1).toString());
//        meals.add(new Meal("Pizza", 5, 10));
//        meals.add(new Meal("Bob", 23, 5.5));
//        meals.add(new Meal("Fish", 58, 8.78));
//        meals.add(new Meal("Steak", 400, 9.56));
//        meals.add(new Meal("Tarator", 241, 1.5));



    }
}
