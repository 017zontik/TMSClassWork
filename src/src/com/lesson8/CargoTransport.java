package src.com.lesson8;

public class CargoTransport extends GroundTransport {
    private long loadCapacity;

    public long getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(long loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String description() {
        return "Грузовой наземный транспорт: " +
                super.description() +
                "Грузоподъемность - " + loadCapacity;
    }

    public void printCanBeLoaded(int cargoWeight) {
        if (cargoWeight <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
