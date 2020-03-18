package src.com.robot.hands;

import src.com.robot.heads.IHead;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }
    public SonyHand() {}

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
