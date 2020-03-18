package src.com.homework8.clothes;

public class Pants extends Clothes implements IClothes{

    public Pants(String name) {
        super(name);
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны " + getName());
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны " + getName());
    }

}
