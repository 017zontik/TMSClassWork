package src.com.homework8.clothes.footwear;

public class Reebok implements IFootwear{
    @Override
    public void putOn() {
        System.out.println("Надеты ботинки Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем ботинки Reebok");
    }
}
