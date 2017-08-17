
public class Person {

    String name;
    String email;
    String city;

    public String sayHello(){

       String greeting = "Hello, " + name;
        System.out.println(greeting);

        return greeting;

    }
}
