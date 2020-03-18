package src.com.homework8.clothes.pants;

public class Mustang implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надеты штаны Mustang");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем штаны Mustang");
    }
}
