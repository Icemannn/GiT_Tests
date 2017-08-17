package Exercise01;

public class Dog {
    String name;
    String bred = "Mutt";
    Double weight;

    public Dog(String name, String bred, Double weight) {
        this.name = name;
        this.bred = bred;
        this.weight = weight;
    }

    public Dog(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bred='" + bred + '\'' +
                ", weight=" + weight +
                '}';
    }
}
