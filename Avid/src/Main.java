import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

/**
 * Created by Ilian on 7/18/2017.
 */
public class Main {

    public static void main(String[] args) {
        /** Dog Class
//        Dog myDog = new Dog();
//
//        myDog.name = "Rex";
//        myDog.furColor = "Black";
//        myDog.age = 10;
//
//        myDog.makeNoise();
        */
        /** Person Class
//        Person first = new Person();
//        first.name = "Ilian";
//
//        Person.sayHello();
        */
        /** Laptop Class
//        Laptop laptop = new Laptop();
//
//        laptop.cpu = "i7";
//
//        laptop.runsTheGame("i7", laptop.cpu);
         */
        /** ConvertionalUnits Class
//
//        ConvertionalUnits converted = new ConvertionalUnits();
//        System.out.println(converted.ouncesToLitters(10));
//
//         */
        /** Bulshits
//
//        Date today = new Date();
//
//        int now = today.getDate();
//        System.out.println(now);
//
//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(10));
//
//        }
//
//
//
//    }
         */





            ArrayList<Phone> phoneArrayList = new ArrayList<>();
            phoneArrayList.add(new Phone("Nokia", "First Model", 5.69, 1998));


            phoneArrayList.add(new Phone("Nokia", "First Model", 5.69, 1998));

            phoneArrayList.add(new Phone("Nokia", "First Model", 5.69, 1998));


        for (int i = 0; i < phoneArrayList.size(); i++) {
            System.out.println(phoneArrayList.get(i));
        }









    }
}
