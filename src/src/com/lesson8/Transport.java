package src.com.lesson8;

abstract class Transport {
    private float power;
    private int maxSpeed;
    private int weight;
    private String name;
    public static final float KILOWATTS_IN_HORSE_POWER = 0.74f;

    public float getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float convertToKilowatts (float powerInHorses) {
        return power * KILOWATTS_IN_HORSE_POWER;
    }

    public  String description () {
        return "мощность - " + power +
                " Мощность в киловаттах: " + convertToKilowatts(power) +
                " Максимальную скорость - " + maxSpeed +
                " Масса - " + weight +
                " Марка - " + name;
    }
}
