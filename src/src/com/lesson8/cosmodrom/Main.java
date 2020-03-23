package src.com.lesson8.cosmodrom;

public class Main {
    public static void main(String[] args) {
       Cosmodrom cosmodrom = new Cosmodrom();
       cosmodrom.launch(new Shuttle());
        cosmodrom.launch(new SpaceX());
    }
}
