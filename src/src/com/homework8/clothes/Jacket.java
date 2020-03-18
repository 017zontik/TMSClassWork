package src.com.homework8.clothes;

public class Jacket extends Clothes implements IClothes {
    public Jacket(String name) {
        super(name);
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку " + getName());
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку " + getName());
    }
}
