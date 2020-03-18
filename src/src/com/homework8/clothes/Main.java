package src.com.homework8.clothes;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", new Jacket("Collins"), new Foot("Adidas"), new Pants("Levis"));
        person1.putOnClothes();
        person1.takeOffClothes();
    }
}
