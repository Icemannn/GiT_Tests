package exercise07HomeworkLunchMeal;

import java.util.ArrayList;

/**
 * Created by Ilian on 7/31/2017.
 */
public class Menu {
    ArrayList<Vegan> veganMenu = new ArrayList<>();
    ArrayList<NonVegan> nonVeganMenu = new ArrayList<>();
    ArrayList<Drinks> drinksMenu = new ArrayList<>();

    public Menu(ArrayList<Vegan> veganMenu, ArrayList<NonVegan> nonVeganMenu, ArrayList<Drinks> drinksMenu) {
        this.veganMenu = veganMenu;
        this.nonVeganMenu = nonVeganMenu;
        this.drinksMenu = drinksMenu;
    }
    public Menu(){

    }

    public ArrayList<Vegan> getVeganMenu() {
        return veganMenu;
    }

    public ArrayList<NonVegan> getNonVeganMenu() {
        return nonVeganMenu;
    }

    public ArrayList<Drinks> getDrinksMenu() {
        return drinksMenu;
    }

    public void addItemVegan(Vegan vegan){
        this.veganMenu.add(vegan);
    }
    public void addItemNonVegan(NonVegan nonVegan){
        this.nonVeganMenu.add(nonVegan);
    }
    public void addItemDrink(Drinks drink){
        this.drinksMenu.add(drink);
    }
    public void printVeganMenu(){
        for (int i = 0; i < getVeganMenu().size(); i++) {
            
            System.out.println(veganMenu.get(i));
        }
    }
    public void printNonVeganMenu(){
        for (int i = 0; i < getNonVeganMenu().size() ; i++) {
            System.out.println(nonVeganMenu.get(i));
        }
    }
    public void printDrinksMenu(){
        for (int i = 0; i < getDrinksMenu().size() ; i++) {

            System.out.println(drinksMenu.get(i).getName());

        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "veganMenu=" + veganMenu +
                ", nonVeganMenu=" + nonVeganMenu +
                ", drinksMenu=" + drinksMenu +
                '}';
    }
}
