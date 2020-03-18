package src.com.homework8.clothes.jacket;

public class ZaraJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем куртку Zara");
    }
}
