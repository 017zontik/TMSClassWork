package src.com.task33;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {
    public static void main(String[] args) {
        try (BufferedReader stream = new BufferedReader(new FileReader("streams.txt"))) {
            String line = stream.readLine();
            int allWordsCounter = 0;
            int allPunctualCounter = 0;
            while (line != null) {

                int wordsCounter = line.split("[\\s]+").length;
                allWordsCounter += wordsCounter;

                Pattern punctuation = Pattern.compile("[,\\.-:;!\\?\"\\(\\)']");

                Matcher m = punctuation.matcher(line);
                int punctualCounter = 0;
                while (m.find()) {
                    punctualCounter++;
                }
                allPunctualCounter += punctualCounter;
                line = stream.readLine();

            }
            System.out.println("Количество слов: " + allWordsCounter);
            System.out.println("Количество знаков препинания: " + allPunctualCounter);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
