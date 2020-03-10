package src.com.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.description();
        for (int i = 0; i < 4; i++) {
            computer.turnOn();
            computer.turnOff();
        }
    }
}
