package src.com.lesson8;

public class PassengerTransport extends GroundTransport {
   private String type;
   private int numberOfPassengers;

    public String getType() {
        return type;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String description() {
        return  "Легковой наземный транспорт: " +
        super.description() +
                " Тип кузова - " + type +
                " К-во пассажиров - " + numberOfPassengers;

    }
    public void printMaxDistanceAndConsumption (float timeInHours) {
        float distance = getMaxSpeed() * timeInHours;
        float totalConsumption = distance * getFuelConsumption() / 100;
        System.out.println("За время " + timeInHours + "час" +
                " проехав " + distance + " Автомобиль " + getName() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " израсходует " + totalConsumption + " литров топлива ");
    }

}
