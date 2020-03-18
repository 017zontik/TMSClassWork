package src.com.homework8.clothes.pants;

public class Levis implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надеты штаны Levis");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем штаны Levis");
    }
}
