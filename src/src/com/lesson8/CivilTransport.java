package src.com.lesson8;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClass;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String description() {
        return "Гражданский воздушный транспорт: " +
                super.description() +
                " Колличество пассажиров " + numberOfPassengers +
                " Бизнес класс " + businessClass;
    }

    public void printCapacity(int numberOfPassengers) {
        if (numberOfPassengers <= this.numberOfPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Нужен самолет побольше");
        }

    }
    public void checkBusinessClass() {
        if (businessClass) {
            System.out.println("Бизнес класс есть");
        } else {
            System.out.println("Это эконом(");
        }
    }
}
