package src.com.lesson8.cosmodrom;

public class Cosmodrom {

    public void launch(IStart starter){

        if (starter.systemCheckBeforeStart()){
            System.out.println("Предстартовая проверка  произведена");
            starter.startEngine();
            for (int i = 10; i >0 ; i--) {
                System.out.println(i);
            }
            starter.start();

        }else {
            System.out.println("Предстартовая проверка провалена");
        }

    }
}
