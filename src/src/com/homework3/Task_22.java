package src.com.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_22 {
    public static void main(String[] args) {
        String str = "У нас есть  16-ричные числа такие как: 0xab2, 0xff, 0xe3d, 0x3fff и не 16-ричные 5484, 548484f, 0xy ";

        Pattern s = Pattern.compile("0x[A-Fa-f0-9]{1,4}");

        Matcher m = s.matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
