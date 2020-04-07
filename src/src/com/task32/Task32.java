package src.com.task32;

import java.util.HashMap;

public class Task32 {
    public static void main(String[] args) {
        String text = "i was she was he she";
        HashMap dictionary = new HashMap();
       String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(dictionary.containsKey(words[i])){
                continue;
            }
            int counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i]) ){
                    counter++;
                }

            }
            dictionary.put(words[i], counter);

        }
        System.out.println(dictionary);


    }

}
