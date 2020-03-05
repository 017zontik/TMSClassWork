package src.com.homework3;

public class Task_20 {
    public static void main(String[] args) {
        String text = new String("Нужно составить предложение, из последних букв. слов предложения");

        StringBuilder str = new StringBuilder();

        String[] s = text.split("\\s|,|\\.");

        for (int i = 0; i < s.length; i++) {
            if (!"".equals(s[i])) {
                str.append(s[i].charAt(s[i].length() - 1));
            }

        }
        System.out.println(str);


 }

}
