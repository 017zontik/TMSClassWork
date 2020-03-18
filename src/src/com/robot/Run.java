package src.com.robot;

import com.sun.media.sound.RIFFInvalidDataException;
import src.com.robot.hands.IHand;
import src.com.robot.hands.SamsungHand;
import src.com.robot.hands.SonyHand;
import src.com.robot.hands.ToshibaHand;
import src.com.robot.heads.SamsungHead;
import src.com.robot.heads.SonyHead;
import src.com.robot.heads.ToshibaHead;
import src.com.robot.legs.SamsungLeg;
import src.com.robot.legs.SonyLeg;
import src.com.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(2500), new SamsungHand(3000), new SamsungLeg(2800));
        Robot robot2 = new Robot(new SamsungHead(3000), new SonyHand(3600), new ToshibaLeg(2300));
        Robot robot3 = new Robot(new ToshibaHead(2700), new ToshibaHand(2400), new SonyLeg(2600));
        robot1.action();
        System.out.printf("*******");
        robot2.action();
        System.out.println("*******");
        robot3.action();
        System.out.println("********");

        Robot[] array = new Robot[]{robot1, robot2, robot3};
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i].getPrice());
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i].getPrice()) {
                max =array[i].getPrice();
               maxIndex=i;
            }
        }
            System.out.println( "Самый догогой робот под индексом " + maxIndex + " стоит " + max);

        }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }

