package src.com.lesson8.cosmodrom;

public class SpaceX implements IStart {
    @Override
    public boolean systemCheckBeforeStart() {
        int a = (int) (Math.random() * 100);
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель SpaceX запущен. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
