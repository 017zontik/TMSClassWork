package src.com.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    final static int STUDENTSQUANTITY = 20;

    public static void main(String[] args) {

        ArrayList<Integer> gradeOfStudent = new ArrayList<>(STUDENTSQUANTITY);

        for (int i = 0; i < STUDENTSQUANTITY; i++) {
            int grade = (int) (Math.random() * 10);
            gradeOfStudent.add(grade);
        }
        System.out.println(gradeOfStudent);
        Iterator iterator = gradeOfStudent.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int next = (int) iterator.next();
            if (next > max) {
                max=next;
            }

        }
        System.out.println("Максимальная оценка учеников  - "+  max);
    }
}
