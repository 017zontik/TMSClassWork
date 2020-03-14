package src.com.lesson8;

public class MilitaryTransport extends AirTransport {
    private boolean catapult;
    private int rocket;

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    @Override
    public String description() {
        return "Военный воздушный транспорт: " +
                super.description() +
                " Катапульта " + catapult +
                " К-во ракет на борту " + rocket;
    }

    public void shot() {
        if (rocket > 0) {
            System.out.println("Ракета пошла...");
            rocket--;
        } else System.out.println("Боеприпасы отсутствуют");
    }

    public void checkCatapult() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
