package src.com.homework8.clothes.footwear;

public class Adidas implements IFootwear {
    @Override
    public void putOn() {
        System.out.println("Надеты ботинки Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты ботинки Adidas");
    }
}
