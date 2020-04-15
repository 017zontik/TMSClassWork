package src.com.task34;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))){

            String line =reader.readLine();

            while (line != null){
                Pattern s = Pattern.compile("[0-9]+");
                Matcher m = s.matcher(line);

                while (m.find()) {
                   numbers.add(Integer.parseInt(m.group())) ;
                }
                line = reader.readLine();
            }
            System.out.println(numbers);


        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i <numbers.size() ; i++) {
          sum += numbers.get(i);
        }
        System.out.println("Сумма: " + sum);

        for (int i = 0; i <numbers.size() ; i++) {
            for (int j = i+1; j <numbers.size() ; j++) {
                if(numbers.get(i).equals(numbers.get(j))){
                    numbers.remove(j);
                }
            }
        }
        System.out.println(numbers);



    }
}
