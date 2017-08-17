package Task065Replit;

import java.util.Scanner;

/**
 * Created by Ilian on 7/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stock stock = new Stock("GOOG", "Google", 100, 500);

        stock.adjustPrice(20);
        stock.setMarketCap();
        System.out.println(stock.toString());
    }
}
