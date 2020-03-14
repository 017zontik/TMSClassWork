package src.com.lesson8;

abstract class GroundTransport extends Transport {
    int numWheels;
    int fuelConsumption;

    public int getNumWheels() {
        return numWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public String description() {
        return  super.description() +
                " Количество колес - " + numWheels +
                " Расход топлива - " + fuelConsumption;
    }



}
