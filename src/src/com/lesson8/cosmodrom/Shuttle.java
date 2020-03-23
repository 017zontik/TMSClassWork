package src.com.lesson8.cosmodrom;

import com.sun.deploy.security.SelectableSecurityManager;

public class Shuttle implements IStart {


    @Override
    public boolean systemCheckBeforeStart() {
        int a = (int)(Math.random() * 10);
        if(a >= 3) {
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель Шатла запущен. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
