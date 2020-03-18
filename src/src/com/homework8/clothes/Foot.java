package src.com.homework8.clothes;

public class Foot extends Clothes implements IClothes{

    public Foot(String name) {
        super(name);
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю ботинки " + getName());
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю ботинки " + getName());
    }
}
