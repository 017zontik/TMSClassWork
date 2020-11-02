package src.com.task35;

import javax.xml.crypto.Data;
import java.io.*;

public class Task35 {
    final static int num = 20;
    public static void main(String[] args) {

        try {
            DataOutputStream doc = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream("binary.dat")));
            for (int i = 0; i <num ; i++) {
                doc.writeInt((int)(Math.random()*100));
            }
            doc.close();
            DataInputStream dic =  new DataInputStream(new BufferedInputStream(new
                    FileInputStream("binary.dat")));
            int size = dic.available()/4;
            int [] numbers = new int[size];
            for (int i = 0; i <size ; i++) {
               numbers[i] = dic.readInt();
            }
            for (int i = 0; i <size ; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.print("\nСреднее орифметическое:");
            int sum = 0;
            for (int i = 0; i <size ; i++) {
                sum +=numbers[i];
            }
            int average = sum/size;
            System.out.println(average);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
