/**
 * Created by Ilian on 7/18/2017.
 */
public class Laptop {



        String brand;
        String cpu;
        String memory;




    public static String runsTheGame (String gameName, String cpu){
        String run = " ";
         if (cpu.equals("i7")){
             run = "Run the Game";
         }
         else{
             run = "Buy better laptop";
         }
        System.out.println(run);
         return run;
    }
}
