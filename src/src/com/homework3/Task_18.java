package src.com.homework3;

public class Task_18 {
    public static void main(String[] args) {

        String str = "Строковый литерал - это последоватедьность символов, заключенных в двойные кавычки.";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if(symbol == ',' || symbol =='.'|| symbol=='-'){
                n++;
            }

        }
        System.out.println("У нас есть " + n + " знаков припинания");
    }
}
