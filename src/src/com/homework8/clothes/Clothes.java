package src.com.homework8.clothes;

public abstract class Clothes implements IClothes {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Clothes(String name){
        this.name=name;
    }

//    @Override
//    public void putOn() {
//        System.out.println("Надеваю "+ name);
//    }
//
//    @Override
//    public void takeOff() {
//        System.out.println("Снимаю " + name);
//    }
}
