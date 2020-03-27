package src.com.task29;

import java.util.ArrayList;

public class Task29 {
    public static void main(String[] args) {
        ArrayList<Integer> gradeOfStudent = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            int grade = (int) (Math.random() * 10);
            gradeOfStudent.add(grade);
        }
        System.out.println(gradeOfStudent);
        ArrayList<Integer> badGrades = new ArrayList<>(4);
        for (int i = 0; i <=3 ; i++) {
                badGrades.add(i);
        }
        System.out.println(badGrades);
        gradeOfStudent.removeAll(badGrades);
        System.out.println(gradeOfStudent);
        }
    }
