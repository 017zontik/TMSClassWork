package src.com.task30;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<Integer> randomNumbers = new ArrayList<>(a);

        for (int i = 0; i < a; i++) {
            int random = (int) (Math.random() * 10);
            randomNumbers.add(random);
        }
        System.out.println(randomNumbers);

        for (int i = 0; i < randomNumbers.size(); i++) {
            for (int j = i + 1; j < randomNumbers.size(); ) {
                if (randomNumbers.get(i) == randomNumbers.get(j)) {
                    randomNumbers.remove(j);
                } else {
                    j++;
                }

            }
        }
        System.out.println(randomNumbers);
    }
}
