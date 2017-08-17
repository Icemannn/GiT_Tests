package exercise05ResturantMenu;

import java.util.ArrayList;

/**
 * Created by Ilian on 7/27/2017.
 */
public class Menu {


    ArrayList<Item> itemArrayList = new ArrayList<>();

    public Menu(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    public Menu(){

    }


    public ArrayList<Item> getItemArrayList() {

        return itemArrayList;
    }

    public void addItems (Item item){
        this.itemArrayList.add(item);


    }
    public void printallItemsName (){
        for (int i = 0; i < getItemArrayList().size() ; i++) {
            System.out.println(itemArrayList.get(i).getName());

        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemArrayList=" + itemArrayList +
                '}';
    }
}
