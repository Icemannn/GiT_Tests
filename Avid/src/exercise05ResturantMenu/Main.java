package exercise05ResturantMenu;

import java.util.ArrayList;

/**
 * Created by Ilian on 7/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItems(new Item("Pizza", 4));
        menu.addItems(new Item("Beer", 4));
        menu.addItems(new Item("Potatos", 6));
        System.out.println(menu);
        menu.printallItemsName();


    }
}
